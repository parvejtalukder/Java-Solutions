/* 
Program Title: CGPA CALCULATOR 
Programmer   : Md Parvej Husen Talukder
*/
package saleryCalc;
import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int totalCourses;
        float diff_in_cgpa;
        float gradepointXcredit = 0;
        float expectedCGPA, foundCGPA, totalCredits = 0;
        System.out.print("Enter Your Expected CGPA: ");
        expectedCGPA = inp.nextFloat();
        System.out.print("How Many Course You Have: ");
        totalCourses = inp.nextInt();
        float[][] grade_and_credit = new float[totalCourses][1];
        for(int i = 0; i < totalCourses; i++) {
            System.out.printf("Enter Your Grade in Course %d: ", i+1);
            grade_and_credit[i][0] = inp.nextFloat();
            System.out.printf("Enter Credit Point of Course %d: ", i+1);
            grade_and_credit[i][1] = inp.nextFloat();
            gradepointXcredit += (grade_and_credit[i][0] * grade_and_credit[i][1]);
            totalCredits+=grade_and_credit[i][1];
        }
        foundCGPA = gradepointXcredit / totalCredits;
        diff_in_cgpa = expectedCGPA - foundCGPA;
        System.out.println();
        if (diff_in_cgpa < 0) {
            diff_in_cgpa = Math.abs(diff_in_cgpa);
            System.out.printf("I found more %.2f than i expected.\n", diff_in_cgpa);
        } else {
            System.out.printf("I found less %.2f than i expected.\n", diff_in_cgpa);
        }
        inp.close();
    }
}