package shop;

public class Product {
    String name;
    double price;
    int quantity;

    void showDetails() {
        System.out.println(name);
        System.out.println(String.format("%.2f", price));        
        System.out.println(quantity);        
    }
}
