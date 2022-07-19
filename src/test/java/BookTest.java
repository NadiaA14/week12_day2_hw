import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("The Green Mile", "Stephan King", "Horror Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Green Mile", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Stephan King", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Horror Fiction", book.getGenre());
    }
}
