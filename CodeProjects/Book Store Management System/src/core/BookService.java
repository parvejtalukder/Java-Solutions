package core;
import java.util.ArrayList;
import book.Book;

public class BookService {
    private ArrayList<Book> books;
    public BookService() {
        books = new ArrayList<Book>();
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void showAllBooks() {
        if (books.size() == 0) {
            System.out.println("No books found.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }
}