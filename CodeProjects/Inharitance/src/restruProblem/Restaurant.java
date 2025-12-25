package restruProblem;

public class Restaurant {

    String name;
    String location;
    
    Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void getServiceType() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }

}