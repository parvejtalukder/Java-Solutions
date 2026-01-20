public class Stuff extends Employee { 
    private double salary;
    Stuff(String n, int i, double r) {
        super(n, i);
        this.salary = r;
    }
    @Override
    void calculateSalary() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary: " + salary + " USD");
    }
}
