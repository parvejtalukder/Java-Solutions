import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import calculator.Calculator;
import subject.Subject;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Subject> subjects = new ArrayList<>();
        Calculator service = new Calculator();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nSubject " + i);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Grade (A+, A, B+, etc): ");
            String grade = sc.next();
            System.out.print("Credit: ");
            double credit = sc.nextDouble();
            subjects.add(new Subject(name, grade, credit));
        }
        try {
            double cgpa = service.calculateCGPA(subjects);
            System.out.println("\n======================");
            System.out.println("CGPA: " + String.format("%.2f", cgpa));
            System.out.println("======================");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}