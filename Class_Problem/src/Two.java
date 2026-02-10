import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int len = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                len = 0;
            }
            len++;
        }
        System.out.println(len - 1);
        scan.close();
    }    
}
