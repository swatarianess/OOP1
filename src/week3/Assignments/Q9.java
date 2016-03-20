package week3.Assignments;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q9 {

    private static final PrintStream ps = System.out;


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ps.print("Enter number of rows and columns in the matrix:\n" + " > ");
        String[] rowsAndColumns = (input.nextLine().split(" "));

        int rows = Integer.valueOf(rowsAndColumns[0]);
        int columns = Integer.valueOf(rowsAndColumns[1]);

        int matrix[][] = new int[rows][columns];

        ps.println("Please enter elements in the matrix: ");
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < columns; j++) {
                ps.print("> ");
                matrix[i][j] = input.nextInt();
            }
        input.close();
        ps.println();
        printMatrix(transposeMatrix(matrix));
    }

    private static int[][] transposeMatrix(int [][] m){
        int a = m.length;
        int b = m[0].length;

        int[][] temp = new int[b][a];

        for (int i = 0; i < b; i++)
            for (int j = 0; j < a; j++)
                temp[i][j] = m[j][i];

        return temp;
    }

    private static void printMatrix(int[][] matrix){
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                ps.print(aMatrix[j] + " ");
            }
            ps.println("");
        }
    }

}
