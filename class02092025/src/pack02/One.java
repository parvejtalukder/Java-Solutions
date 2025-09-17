package pack02;
import java.util.Scanner;
public class One {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, dept;
		int rollNumber;
		name = input.nextLine();
		dept = input.nextLine();
		rollNumber = input.nextInt();
		System.out.println("My name is " + name + ", I am a student of " + dept + ". My roll is " + rollNumber);
		input.close();
	}

}
