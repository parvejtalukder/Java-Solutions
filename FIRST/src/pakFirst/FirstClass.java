package pakFirst;
import java.util.Scanner;
public class FirstClass {
    public static void Calc(int number) {
        if (number > 0) {
            System.out.println(number + " is a Positive Number");
        } else {
            System.out.println(number + " is a Negative Number");
        }
    }
    public static int Odev(int number) {
    	if (number % 2 == 0) {
        	return 1;
        } else {
        	return 2;
        }
    }
    public static void main(String[] args) {
        Scanner fpk = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int noOne = fpk.nextInt();
        Calc(noOne);
        int OdevR = Odev(noOne);
        if (OdevR == 1) {
        	System.out.println(noOne + " is Even");
        } else {
        	System.out.println(noOne + " is Odd");4
        }
        
    }
}
