package shop;
public class MainClass {
    public static void main(String[] args) {
        Product Water = new Product();
        Water.name = "Pran Water";
        Water.price = 20.54;
        Water.quantity = 5;
        Water.showDetails();
        Product Laptop = new Product();
        Laptop.name = "Apple Mac Book";
        Laptop.price = 120000;
        Laptop.quantity = 1;
        Laptop.showDetails();
        Product Book = new Product();
        Book.name = "Chorar Jhalak";
        Book.price = 100;
        Book.quantity = 3;
        Book.showDetails();
    }
}
