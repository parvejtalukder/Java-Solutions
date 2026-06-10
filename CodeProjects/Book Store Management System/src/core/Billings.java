package core;

import book.Book;

public class Billings {
    public void buyBook(Book book, int quantity) throws Exception {
        if (book == null) {
            throw new Exception("Book not found.");
        } 

        if (quantity <= 0) {
            throw new Exception("Quantity must be greater than 0.");
        } 

        if (book.getStock() < quantity) {
            throw new Exception("Not enough stock.");
        }   

        int newStock = book.getStock() - quantity;
        book.setStock(newStock);

        double total = book.getPrice() * quantity;

        System.out.println();
        System.out.println("========== BILL ==========");
        System.out.println("Book Name : " + book.getTitle());
        System.out.println("Quantity  : " + quantity);
        System.out.println("Unit Price: Tk " + book.getPrice());
        System.out.println("Total Bill: Tk " + total);
        System.out.println("==========================");
        System.out.println();
    }
}
