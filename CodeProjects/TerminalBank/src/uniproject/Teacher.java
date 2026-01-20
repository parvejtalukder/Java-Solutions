public class Teacher extends Employee {
    private double ratePerH;
    Teacher(String n, int i, double r) {
        super(n, i);
        this.ratePerH = r;
    }
    @Override
    void calculateSalary() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + (this.ratePerH * 200) + " USD");
    }
}
