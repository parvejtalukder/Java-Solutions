package onlineShop;

public class Product {

    String name;
    double price;
    double discount;

    double discountCalculator(double disc, double price) {
        return (price) - (disc * (price/100.00));
    }
    
}
