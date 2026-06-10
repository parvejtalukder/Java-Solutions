package core;
import java.util.ArrayList;
import book.Book;

public class BookSearch {
    public Book searchByTitle(ArrayList<Book> books, String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            } 
        }
        return null;
    }
}
