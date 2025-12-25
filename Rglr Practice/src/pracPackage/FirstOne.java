package pracPackage;
import java.util.Scanner;

public class FirstOne {
    public static void main(String[] args) {
        Scanner toTake = new Scanner(System.in);
        int[][] Mtrix = new int[3][6];
        int Row = Mtrix.length;
        int Colm = Mtrix[0].length;
        // Printer(Row, Colm);
        for(int i = 0; i < Row; i++) {
            for(int j = 0; j < Colm; j++) {
                Mtrix[i][j] = toTake.nextInt();
            }
        }
        toPrint(Mtrix);

        toTake.close();
    }
    // static void Printer(int Row, int Colm) {
    //     System.out.println("Row: " + Row);
    //     System.out.println("Colm: " + Colm);
    // }
    static void toPrint(int[][] matrix) {
    for (int[] row : matrix) {
        for (int elmnt : row) {
            System.out.print(elmnt + " ");
            }
            System.out.println();
        }
    }

}
