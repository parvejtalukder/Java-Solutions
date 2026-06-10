package calculator;
import java.util.List;
import subject.Subject;
import thread.StudentsThread;
public class Calculator {

    private double getPoint(String grade) {
        grade = grade.toUpperCase();

        if (grade.equals("A+")) {
            return 4.00;
        } else if (grade.equals("A")) {
            return 3.75;
        } else if (grade.equals("A-")) {
            return 3.50;
        } else if (grade.equals("B+")) {
            return 3.25;
        } else if (grade.equals("B")) {
            return 3.00;
        } else if (grade.equals("B-")) {
            return 2.75;
        } else if (grade.equals("C+")) {
            return 2.50;
        } else if (grade.equals("C")) {
            return 2.25;
        } else if (grade.equals("D")) {
            return 2.00;
        } else if (grade.equals("F")) {
            return 0.00;
        } else {
            return -1;
        }
    }

    public double calculateCGPA(List<Subject> subjects) throws Exception {
        double totalPoints = 0;
        double totalCredits = 0;
        for (Subject subject : subjects) {
            double point = getPoint(subject.getGrade());
            if (point < 0) {
                throw new Exception("Invalid grade: " + subject.getGrade());
            }
            totalPoints += point * subject.getCredit();
            totalCredits += subject.getCredit();
        }
        if (totalCredits == 0) {
            throw new Exception("Total credit cannot be zero.");
        }
        double cgpa = totalPoints / totalCredits;
        StudentsThread logThread = new StudentsThread(
                "CGPA_CALCULATED",
                "CGPA = " + String.format("%.2f", cgpa)
        );
        logThread.start();
        return cgpa;
    }

}