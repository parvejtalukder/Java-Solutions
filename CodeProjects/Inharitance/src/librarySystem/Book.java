package librarySystem;

public class Book {

    String title;
    String author;
    int page;

    void showDetails() {
        System.out.println("Book Meta_");
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Pages: " + page);
    }
    
}