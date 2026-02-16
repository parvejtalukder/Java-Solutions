package problemeight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wordOne, wordTwo;
        wordOne = scan.nextLine();
        wordTwo = scan.nextLine();
        scan.close();
        if (wordOne.length() != wordTwo.length()) {
            System.out.println("false");
            return;
        }
        char[] arrOne = wordOne.toCharArray();
        char[] arrTwo = wordTwo.toCharArray();
        for (int i = 0; i < arrOne.length - 1; i++) {
            for (int j = 0; j < arrOne.length - i - 1; j++) {
                if (arrOne[j] > arrOne[j + 1]) {
                    char temp = arrOne[j];
                    arrOne[j] = arrOne[j + 1];
                    arrOne[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrTwo.length - 1; i++) {
            for (int j = 0; j < arrTwo.length - i - 1; j++) {
                if (arrTwo[j] > arrTwo[j + 1]) {
                    char temp = arrTwo[j];
                    arrTwo[j] = arrTwo[j + 1];
                    arrTwo[j + 1] = temp;
                }
            }
        }
        // System.out.println(arrOne);
        // System.out.println(arrTwo);
        boolean isSame = true;
        for(int i = 0; i < arrOne.length; i++) {
            if (!(arrOne[i] == arrTwo[i])) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}