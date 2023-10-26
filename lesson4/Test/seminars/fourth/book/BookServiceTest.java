package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Test
    void findByIdTest() {
        BookRepository br = new InMemoryBookRepository();
        BookService bs = new BookService(br);
        assertThat(bs.findBookById("1")).isInstanceOf(Book.class);
        assertThat(bs.findBookById("1").getTitle()).isEqualTo("Book1");
    }

    @Test
    void findAllTest() {
        BookRepository br = new InMemoryBookRepository();
        BookService bs = new BookService(br);
        assertThat(bs.findAllBooks().size()).isEqualTo(2);
    }
}