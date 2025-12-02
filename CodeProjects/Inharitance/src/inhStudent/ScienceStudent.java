package inhStudent;

public class ScienceStudent extends Student {

    void displayInfo(String name) {
        super.displayInfo(name);
        System.out.println("Department: Science");
    }

    void displayInfo(String name, int roll) {
        super.displayInfo(name, roll);
        System.out.println("Department: English");
    }

}