package pakFirst;
import java.util.Scanner;
public class PracTask {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println(":::You Will Enter");
		System.out.println("N Number, We Will Sum");
		System.out.println("All 0 to N and Print:::");
		System.out.println("Enter Number: ");
		int sum = 0;
		int num = obj.nextInt();
		for(int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
		obj.close();
	}
}
