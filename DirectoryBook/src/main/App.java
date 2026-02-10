package main;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp;
        StringBuffer std = new StringBuffer();
        StringBuffer dept = new StringBuffer();
        StringBuffer uni = new StringBuffer();
        System.out.println("===== Student Information Center ===");
        System.out.println(" Your Name? ==============");
        temp = scan.nextLine();
        std.append(temp);
        temp = "";
        System.out.println(" Your Department? ==============");
        temp = scan.nextLine();
        dept.append(temp);
        temp = "";
        System.out.println(" Your University? ==============");
        temp = scan.nextLine();
        uni.append(temp);
        temp = "";
        // System.out.println("===== Student Information Center ===");
    }
}