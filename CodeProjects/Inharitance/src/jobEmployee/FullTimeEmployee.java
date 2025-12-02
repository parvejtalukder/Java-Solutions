package jobEmployee;

public class FullTimeEmployee extends Employee {

    int calculateSalary() {
        return 5000;
    }
    int calculateSalary(int bonus) {
        return 5000 + bonus;
    }

}
