package shop;

public class Product {

    String name;
    double price;
    int quantity;

    void showDetails() {
        System.out.println(name);
        System.out.printf("%.2f \n", price);
        System.out.println(quantity);
    }
    
}
