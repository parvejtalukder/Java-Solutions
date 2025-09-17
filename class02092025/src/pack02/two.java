package pack02;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double one, two, three, sum = 0, avg;
		one = input.nextDouble();
		two = input.nextDouble();
		three = input.nextDouble();
		sum = one + two + three;
		avg = sum / 3.0;
		System.out.println("Average is " + avg);
        input.close();
	}
}