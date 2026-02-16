package problemfive;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String fullLine = scn.nextLine();
        scn.close(); int si = fullLine.length();
        StringBuilder normal = new StringBuilder();
        fullLine = fullLine.toLowerCase();
        // fullLine = fullLine.trim();
        for(int i = 0; i < si; i++) {
            char c = fullLine.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                normal.append(c);
            }
        }
        StringBuilder revers = new StringBuilder(normal);
        normal.reverse();
        if ((normal.toString()).equals(revers.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // System.out.println(revers.toString());
        // System.out.println(normal.toString());
    }
}