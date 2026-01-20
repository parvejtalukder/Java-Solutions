abstract class Employee implements User {
    String name;
    int id;
    // double 
    @Override 
    public void logout() {
        System.out.println("LogOut");
    }
    public void login() {
        System.out.println("LogIn");
    }
    Employee(String n, int i) {
        this.name = n;
        this.id = i;
    }
    abstract void calculateSalary();
}