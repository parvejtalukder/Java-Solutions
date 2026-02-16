package problemsix;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String words = scn.nextLine();
        scn.close();
        String[] array = words.split(" ");
        StringBuffer arr = new StringBuffer();
        int size = array.length;
        for(int i = size - 1; i >= 0; i--) {
            arr.append(array[i]);
            if (i != 0) {
                arr.append(" ");
            }
        }
        System.out.println(arr.toString());
    }
}