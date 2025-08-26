/* 
Program Title: Initial and Increament Salary Difference 
By Md Parvej Husen Talukder
*/
package saleryCalc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner toTake = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = toTake.nextInt();
        float[][] salaryIncrement = new float[numberOfEmployees][2];
		float[] salaryIncremented = new float[numberOfEmployees];
        float totalSalary = 0, totalIncremented = 0, netDifference;
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nGive Me Info. for Employee No. " + (i + 1) + ":");
            System.out.print("Enter Salary in BDT: ");
            salaryIncrement[i][0] = toTake.nextFloat();
            System.out.print("Enter Increment Percentage: ");
            salaryIncrement[i][1] = toTake.nextFloat();
            // totalSalary += salaryIncrement[i][0];
			salaryIncremented[i] = salaryIncrement[i][0] * (salaryIncrement[i][1]/(float)100);
            // salaryIncremented[i] = salaryIncrement[i][0] + (salaryIncrement[i][0] * (salaryIncrement[i][1]/(float)100));
			totalIncremented+=salaryIncremented[i];
        }
		// netDifference = totalIncremented - totalSalary;
		// System.out.println();
	    // System.out.printf("Company Have To Pay Extra %.2f BDT\n", netDifference);
		// System.out.println("www.parvejhusentalukder.com");
        System.out.println();
        System.out.printf("Company Have To Pay Extra %.2f BDT\n", totalIncremented);
        toTake.close();
    }
}