package problemone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        // int ans = 1;
        boolean ans = true;
        int nowin = -1;
        int n = str.length();
        char[] backs = new char[n];
        for(int i = 0; i < n; i++) {
            char chr = str.charAt(i);
            if (chr == '(') {
                nowin++;
                backs[nowin] = ')';
            } else if (chr == '{') {
                nowin++;
                backs[nowin] = '}';
            } else if (chr == '[') {
                nowin++;
                backs[nowin] = ']';
            } else {
                if (nowin == -1 || backs[nowin] != chr) {
                    ans = false;
                    break;
                }
                nowin--;
            }
        }
        if (nowin == -1 && ans) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

