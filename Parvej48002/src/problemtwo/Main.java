package problemtwo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        scn.close();
        String[] arr = line.split(" ");
        int size = arr.length;
        System.out.println(arr[size - 1].length());
    }
}
