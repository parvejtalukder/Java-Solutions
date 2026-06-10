package core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import book.Book;

public class BookFiles {

    private String fileName;
    public BookFiles() {
        fileName = "books.txt";
    }

    public void save(ArrayList<Book> books) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            for (int i = 0; i < books.size(); i++) {
                writer.println(books.get(i).toFileString());
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public ArrayList<Book> load() {
        ArrayList<Book> books = new ArrayList<Book>();
        try {
            File file = new File(fileName);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        String title = parts[0];
                        String author = parts[1];
                        double price = Double.parseDouble(parts[2]);
                        int stock = Integer.parseInt(parts[3]);

                        Book book = new Book(title, author, price, stock);
                        books.add(book);
                    } 
                }
                reader.close();
            } else {
                System.out.println("FILE NOT EXIST...");
            }
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
        return books;
    }
}
