package studentInfo;

public class Student {

    void StudentInfo(String name, String department, String uni) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Department: " + department);
        System.out.println("Student University: " + uni);
    }
    void StudentInfo(String name, String department, int roll) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Department: " + department);
        System.out.println("Student University: " + roll);
    }
    void StudentInfo(String name, String department, int roll, int result) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Department: " + department);
        System.out.println("Student University: " + roll);
        System.out.println("Student Result: " + result);
    }
    
}