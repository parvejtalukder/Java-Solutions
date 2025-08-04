// My Package [PHT]
package pakFirst;
// Importing [Scanner class]
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		// Creating obj. under Scanner
		Scanner input = new Scanner(System.in);
		// Displaying Msg to Users
		System.out.println("--| Basic Calculator |--");
		System.out.println("-----------------------");
		// Declaring Variables 
		double numOne, numTwo;
		char sign;
		double result;
		// Taking input with a notice
		System.out.println("<<| Enter A Number: ");
		numOne = input.nextDouble();
		System.out.println("<<| Enter Operator [+, -, *, /, %]: ");
		sign = input.next().charAt(0);
		System.out.println("<<| Enter Another Number: ");
		numTwo = input.nextDouble();
		input.close();
		// Operation
		if (sign == '+') {
			result = numOne + numTwo;
		} else if (sign == '-') {
			result = numOne - numTwo;
		} else if (sign == '*') {
			result = numOne * numTwo;
		} else if (sign == '/') {
			result = numOne / numTwo;
		} else if (sign == '%') {
			result = numOne % numTwo;
		} else {
			result = 404;
		}
		// INT _ DOUBLE
		// Displaying Ans
		if (numOne == (int) numOne && numTwo == (int)numTwo && sign == '+' || sign == '-' || sign == '*') {
			// Displaying 
			if (result != 404) {
				System.out.println((int)numOne + " " + sign + " " + (int)numTwo + " = " + (int)result);
			} else {
				System.out.println("Error!");
			}
		} else if (numOne == (int) numOne && numTwo == (int)numTwo && sign == '/' || sign == '%') {
			if (result == (int) result) {
				System.out.println((int)numOne + " " + sign + " " + (int)numTwo + " = " + (int)result);
			} else {
				result = Math.round(result);
				System.out.println((int)numOne + " " + sign + " " + (int)numTwo + " = " + (int)result + " (Rounded Ans)");
			}
		} else {
			System.out.println("Math Error!");
		}
		// An Incomplete Code
	}
}
