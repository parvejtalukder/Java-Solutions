public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Farjana Akter Ma'am", 435545, 5);
        Stuff stf = new Stuff("Abdul Mia", 4335545, 5);
        teacher.login();
        teacher.calculateSalary();
        teacher.logout();
        System.out.print("\n");
        stf.login();
        stf.calculateSalary();
        stf.logout();
    }
}