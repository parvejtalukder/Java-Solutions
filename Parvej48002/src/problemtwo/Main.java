package problemtwo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account prantho = new Account();
        int val = input.nextInt();
        prantho.Rakhram(val);
        System.out.println(prantho.Niram());
        input.close();
    }

}
