import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < 10) {
            this.books.add(book);
        }
    }

    public Book removeBook() {
        return this.books.remove(0);
    }
}
