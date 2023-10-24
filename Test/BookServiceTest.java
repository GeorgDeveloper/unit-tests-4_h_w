
import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Test
    public void testFindBookById_BookExists() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        String bookId = "1";
        Book expectedBook = new Book(bookId, "Book1", "Author1");
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        Book foundBook = bookService.findBookById(bookId);

        assertEquals(expectedBook, foundBook);
    }

    @Test
    public void testFindBookById_BookNotFound() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        String bookId = "3";
        when(bookRepository.findById(bookId)).thenReturn(null);

        Book foundBook = bookService.findBookById(bookId);

        assertNull(foundBook);
    }

    @Test
    public void testFindAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );

        when(bookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> foundBooks = bookService.findAllBooks();

        assertEquals(expectedBooks, foundBooks);
    }
}

