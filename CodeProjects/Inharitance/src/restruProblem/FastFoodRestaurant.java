package restruProblem;

public class FastFoodRestaurant extends Restaurant {

    double deliveryTime;
    FastFoodRestaurant(String name, String location, double dTime) {
        super(name, location);
        this.deliveryTime = dTime;
    }

    void getServiceType() {
        super.getServiceType();
        System.out.println("Delivery Time: " + deliveryTime);
    }
    
}