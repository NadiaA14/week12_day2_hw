import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("The Green Mile", "Stephan King", "Horror Fiction");
    }

    @Test
    public void bookCount(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void hasCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(10, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }
}
