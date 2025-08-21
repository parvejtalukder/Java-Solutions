/* 
Program Title: Initial and Increament Salary Difference 
Programmer   : Md Parvej Husen Talukder
*/
package saleryCalc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        float[][] salaryIncrement = new float[numberOfEmployees][2];
		float[] salaryIncremented = new float[numberOfEmployees];
        float totalSalary = 0, totalIncremented = 0, netDifference;
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nGive Me Info. for Employee No. " + (i + 1) + ":");
            System.out.print("Enter salary in BDT: ");
            salaryIncrement[i][0] = scanner.nextFloat();
            System.out.print("Enter increment percentage: ");
            salaryIncrement[i][1] = scanner.nextFloat();
            totalSalary += salaryIncrement[i][0];
			salaryIncremented[i] = salaryIncrement[i][0] + (salaryIncrement[i][0] * (salaryIncrement[i][1]/(float)100));
			totalIncremented+=salaryIncremented[i];
        }
		netDifference = totalIncremented - totalSalary;
		System.out.println();
	    System.out.printf("Company Have To Pay Extra %.2f BDT\n", netDifference);
        scanner.close();
    }
}