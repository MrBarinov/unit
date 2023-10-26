package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {

    @Test
    void messageServiceTest() {
        MessageService ms = mock(MessageService.class);

        NotificationService ns = new NotificationService(ms);
        ns.sendNotification("Сообщение отправлено", "Alex");

        verify(ms, times(1)).sendMessage("Сообщение отправлено", "Alex");
    }
}