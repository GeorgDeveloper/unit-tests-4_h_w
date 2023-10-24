import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;
import seminars.fourth.book.InMemoryBookRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InMemoryBookRepositoryTest {

    @Test
    public void testFindById() {
        InMemoryBookRepository repository = new InMemoryBookRepository();
        String bookId = "1";
        Book book = repository.findById(bookId);
        assertEquals("Book1", book.getTitle());
        assertEquals("Author1", book.getAuthor());
    }

    @Test
    public void testFindAll() {
        InMemoryBookRepository repository = new InMemoryBookRepository();
        List<Book> books = repository.findAll();
        assertEquals(2, books.size());
    }

    @Test
    public void testFindByIdNotFound() {
        InMemoryBookRepository repository = new InMemoryBookRepository();
        String bookId = "3"; // Этой книги нет в репозитории
        Book book = repository.findById(bookId);
        assertNull(book);
    }
}
