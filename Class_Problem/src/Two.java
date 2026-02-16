import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.split(" ");
        System.out.println((arr[arr.length - 1]).length());
        scan.close();
    }    
}