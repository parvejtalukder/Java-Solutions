package pack02;
import java.util.Scanner;
public class three {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		double sum = 0, discountedPrice;
		num = input.nextInt();
		double[] items = new double[num];
		for(int i = 0; i < num; i++) {
			items[i] = input.nextDouble();
			sum+=items[i];
		}
		if (sum > 500) {
			discountedPrice = sum * (5.00/100.00);
			sum = sum - discountedPrice;
			System.out.println(sum);
		} else {
			System.out.println(sum);
		}
        input.close();
	}
}