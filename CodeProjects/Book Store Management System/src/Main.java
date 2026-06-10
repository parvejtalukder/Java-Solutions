import java.util.Scanner;
import book.Book;
import core.BookService;
import core.Billings;
import core.BookFiles;
import core.BookSearch;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookService bookService = new BookService();
        BookSearch searchService = new BookSearch();
        Billings billingService = new Billings();
        BookFiles fileService = new BookFiles();
        bookService.setBooks(fileService.load());

        while (true) {

            System.out.println();
            System.out.println("===== BOOK STORE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Show Stock");
            System.out.println("4. Buy Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter stock: ");
                    int stock = Integer.parseInt(scanner.nextLine());
                    Book newBook = new Book(title, author, price, stock);
                    bookService.addBook(newBook);
                    fileService.save(bookService.getBooks());
                    System.out.println("Book added successfully.");
                }
                else if (choice == 2) {
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = searchService.searchByTitle(
                            bookService.getBooks(), searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                }
                else if (choice == 3) {
                    if (bookService.getBooks().isEmpty()) {
                        System.out.println("No books in stock.");
                    } else {
                        bookService.showAllBooks();
                    }
                }
                else if (choice == 4) {
                    System.out.print("Enter book title to buy: ");
                    String buyTitle = scanner.nextLine();
                    Book bookToBuy = searchService.searchByTitle(
                            bookService.getBooks(), buyTitle);
                    if (bookToBuy != null) {
                        System.out.print("Enter quantity: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        billingService.buyBook(bookToBuy, quantity);
                        fileService.save(bookService.getBooks());
                    } else {
                        System.out.println("Book not found.");
                    }
                }
                else if (choice == 5) {
                    fileService.save(bookService.getBooks());
                    System.out.println("Exiting system... Thank you!");
                    scanner.close();
                    break;
                }
                else {
                    System.out.println("Invalid choice! Please enter 1-5.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}