package mySrc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner calcObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = calcObj.nextInt();
        int c = a;  
        System.out.println("Result: " + c);
        calcObj.close();
    }
}
