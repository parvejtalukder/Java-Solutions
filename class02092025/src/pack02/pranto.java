package pack02;
import java.util.Scanner;
public class pranto {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double A, B, AVG;
        A = inp.nextDouble();
        B = inp.nextDouble();
        AVG = ((A * 3.5) + (B * 7.5)) / 3.5 + 7.5;
        System.out.println(AVG);
        inp.close();
    }
}