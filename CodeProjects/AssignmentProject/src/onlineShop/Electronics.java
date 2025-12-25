package onlineShop;

public class Electronics extends Product {

    int warrantyInYears;

    void ProductInfo() {
        System.out.println(name);
        System.out.printf("Reguler Price: %.2f \n", price);
        System.out.printf("Discouted Price: %.2f \n", discountCalculator(45, price));
        System.out.printf("Warranty (in years): " + warrantyInYears + "\n");
    }
    
}