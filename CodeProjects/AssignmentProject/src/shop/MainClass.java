package shop;

public class MainClass {

    public static void main(String[] args) {
        Product book = new Product();
        book.name = "ABC Rhymes";
        book.price = 200;
        book.quantity = 4;
        book.showDetails();
        Product pen = new Product();
        pen.name = "ABC Pen";
        pen.price = 100;
        pen.quantity = 14;
        pen.showDetails();
    }
    
}
