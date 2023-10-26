package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    public void validAuth() {
        User user = new User("Nick", "123", false);
        assertTrue(user.authenticate("Nick", "123"));
    }

    @Test
    public void InvalidAuth() {
        User user = new User("Nick", "123", false);
        assertFalse(user.authenticate("Nick", "124"));
    }

    @Test
    public void getIsAuth() {
        User user = new User("Nick", "123", false);
        user.authenticate("Nick", "123");
        UserRepository ur = new UserRepository();
        ur.addUser(user);
        assertThat(ur.data).contains(user);
    }

    @Test
    public void getNotIsAuth() {
        User user = new User("Nick", "123", false);
        user.authenticate("Nick", "1234");
        UserRepository ur = new UserRepository();
        ur.addUser(user);
        assertThat(ur.data).doesNotContain(user);
    }

    @Test
    public void adminInListAfterLogOut() {
        User user = new User("Nick", "123", false);
        user.authenticate("Nick", "123");
        User user2 = new User("Alex", "1234", true);
        user2.authenticate("Alex", "1234");
        UserRepository ur = new UserRepository();
        ur.addUser(user);
        ur.addUser(user2);
        ur.logOutNotAdmin();
        assertThat(ur.data).doesNotContain(user);
        assertThat(ur.data).contains(user2);
    }
}