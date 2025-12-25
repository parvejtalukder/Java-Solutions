package pracPackage;
// import java.util.*;
public class SecOne {
    public static void main(String[] args) {
        int[][] matrixA = {
            {8, 1, 5},
            {3, 6, 2},
            {0, 7, 4}
            };
        int[][] matrixB = {
            {2, 9, 3},
            {5, 1, 8},
            {6, 4, 7}
        };
        toSum(matrixA, matrixB);
    }
    static void toSum(int[][] arrA, int[][] arrB) {
        int row, colm;
        row = arrA.length;
        colm = arrA[0].length;
        int[][] matrixResult = new int[row][colm];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < colm; j++) {
                matrixResult[i][j] = arrA[i][j] + arrB[i][j];
            }
        }
        toPrint(matrixResult);
    }
    static void toPrint(int[][] sumMatrix) {
        for(int[] row: sumMatrix) {
            for(int elmnt: row) {
                System.out.print(elmnt + " ");
            }
            System.out.println();
        }
    }
}
