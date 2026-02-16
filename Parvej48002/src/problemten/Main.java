package problemten;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close(); int s = str.length();
        int[] vindx = new int[s]; int x = 0;
        // int[] vindx = new int[s]; int y = 0;
        for(int i = 0; i < s; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vindx[x] = i;
                x++;        
            }
        }
        int y = 0;
        int[] rev = new int[x];
        for(int i = x - 1; i >= 0; i--) {
            rev[y] = vindx[i];
            y++;
        }
        y = 0;
        // System.out.println(rev[0] + " " + rev[1]);
        // System.out.println(vindx[0] + " " + vindx[1]);
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s; i++) {
            boolean isFound = false;
            for (int j = 0; j < x; j++) {
                if (i == vindx[j]) {
                    isFound = true;
                    break;
                } 
            }
            if (isFound) {
                answer.append(str.charAt(rev[y]));
                y++;
            } else {
                answer.append(str.charAt(i));
            }
        }
        System.out.println(answer.toString());
    }
}