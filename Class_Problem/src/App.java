import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        char[] br_one = new char[2];
        br_one[0] = '(';
        br_one[1] = ')';
        char[] br_two = new char[2];
        br_two[0] = '{';
        br_two[1] = '}';
        char[] br_three = new char[2];
        br_three[0] = '[';
        br_three[1] = ']';
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char sf;
        StringBuffer an = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == br_one[0]) {
                sf = ch;
            }
        }
        // System.out.println(an.toString());
    }
}
