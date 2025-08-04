package mainCalc;
import java.util.Scanner;
public class MainCode {
	public static void main(String[] args) {
		char sign;
		double numOne, numTwo, Ans = 0;
		Scanner inp = new Scanner(System.in);
		System.out.println("--------|>> Calc <<|--------");
		for(int i = 1; i < 4; i++) {
			System.out.print(" **pht** ");
		}
		System.out.print("\n-------");
		System.out.print(" +, -, *, /, % ");
		System.out.print("------\n");

		System.out.print("Enter A Number: ");
		numOne = inp.nextDouble();
		System.out.print("Enter Another Number: ");
		numTwo = inp.nextDouble();
		System.out.print("Enter Your Operator: ");
		sign = inp.next().charAt(0);
		inp.close();

		if (sign == '/' || sign == '%') {
			if (numTwo == 0.00) {
				System.out.println("Number is not dividable by " + (int)numTwo);
				return;
			}
		}

		switch (sign) {
			case '+':
				Ans = numOne + numTwo;
				break;
			case '-':
				Ans = numOne - numTwo;
				break;
			case '*':
				Ans = numOne * numTwo;
				break;
			case '/':
				Ans = numOne / numTwo;
				break;
			case '%':
				Ans = numOne % numTwo;
			default:
				System.out.println("Wrong Opeartor");
				break;
		}
		System.out.print("\n--------");
		System.out.print("   Result   ");
		System.out.print("--------\n");
		if ((int)numOne == numOne && (int)numTwo == numTwo) {
			System.out.print("      ");
			System.out.printf("%d %c %d = ", (int)numOne, sign, (int)numTwo);
			System.out.printf("%.0f", Ans);	
			System.out.println("      ");	
		} 
		else {
			System.out.print("   ");
			System.out.printf("%.2f %c %.2f = ", numOne, sign, numTwo);
			System.out.printf("%.2f", Ans);	
			System.out.println("      ");
		}
		System.out.println("----------------------------");
	}
}
