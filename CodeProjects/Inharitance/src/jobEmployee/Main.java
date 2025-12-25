package jobEmployee;

public class Main {

    public static void main(String[] args) {
        Employee pht = new FullTimeEmployee();
        int ansOne = pht.calculateSalary();
        int ansTwo = pht.calculateSalary(100);
        int ansThree = pht.calculateSalary();
        int ansFour = pht.calculateSalary(200);
        System.out.println("Salery (Full Time): " + ansOne);
        System.out.println("Salery (Full Time) With Bonus: " + ansTwo);
        System.out.println("Salery (Part Time): " + ansThree);
        System.out.println("Salery (Part Time) With Bonus: " + ansFour);
    }
    
}
