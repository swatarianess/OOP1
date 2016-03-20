package week3.Assignments;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q10 {

    private static final PrintStream ps = System.out;
    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args){
        Q10 q = new Q10();

        ps.println("Select the type of operation on the matrix.\n1: Transposition\n2: addition\n3: Product of two matrices\n >");
        int option = Integer.valueOf(input.nextLine());
        switch(option){
            case 1:
                q.option1();
                break;

            case 2:
                q.option2();
                break;

            case 3:
                q.option3();
                break;

            default:
                ps.print("Please select an option. Exiting.");
                break;
        }

    }

    /**
     * Transposition of a Matrix
     * @param m The matrix to transpose
     * @return Returns the transposed matrix
     */
    private int[][] transposeMatrix(int [][] m){
        int a = m.length;
        int b = m[0].length;

        int[][] temp = new int[b][a];

        for (int i = 0; i < b; i++)
            for (int j = 0; j < a; j++)
                temp[i][j] = m[j][i];

        return temp;
    }

    /**
     * Prints a matrix in the correct format
     * @param matrix The matrix to print
     */
    private void printMatrix(int[][] matrix){
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                ps.print(aMatrix[j] + " ");
            }
            ps.println("");
        }
    }

    /**
     *  Transposition of a matrix option.
     */
    private void option1(){
        ps.print("Enter number of rows and columns in the matrix:\n" + " > ");
        String[] rowsAndColumns = input.nextLine().split(" ");

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

    /**
     * Addition of two matrices
     */
    private void option2(){
        ps.print("Enter number of rows in the FIRST matrix:\n" + " > ");
        int rowsMatrixOne = input.nextInt();

        ps.print("Enter number of columns in the FIRST matrix:\n" + " >  ");
        int columnsMatrixOne = input.nextInt();
        int matrixOne[][] = new int[rowsMatrixOne][columnsMatrixOne];

        ps.println("Please enter elements in the FIRST matrix: ");
        for(int i = 0; i < rowsMatrixOne; i++)
            for(int j = 0; j < columnsMatrixOne; j++) {
                ps.print("> ");
                matrixOne[i][j] = input.nextInt();
            }
        ps.println();

        ps.print("Enter number of rows in the SECOND matrix:\n" + " > ");
        int rowsMatrixTwo = input.nextInt();

        ps.print("Enter number of columns in the SECOND matrix:\n" + " >  ");
        int columnsMatrixTwo = input.nextInt();
        int matrixTwo[][] = new int[rowsMatrixTwo][columnsMatrixTwo];

        ps.println("Please enter elements in the SECOND matrix: ");
        for(int i = 0; i < rowsMatrixTwo; i++)
            for(int j = 0; j < columnsMatrixTwo; j++) {
                ps.print("> ");
                matrixTwo[i][j] = input.nextInt();
            }
        input.close();
        ps.println();
        printMatrix(addMatrix(matrixOne,matrixTwo));
    }

    /**
     * Product of two matrices
     */
    private void option3(){
        ps.print("Enter number of rows in the FIRST matrix:\n" + " > ");
        int rowsMatrixOne = input.nextInt();

        ps.print("Enter number of columns in the FIRST matrix:\n" + " >  ");
        int columnsMatrixOne = input.nextInt();
        int matrixOne[][] = new int[rowsMatrixOne][columnsMatrixOne];

        ps.println("Please enter elements in the FIRST matrix: ");
        for(int i = 0; i < rowsMatrixOne; i++)
            for(int j = 0; j < columnsMatrixOne; j++) {
                ps.print("> ");
                matrixOne[i][j] = input.nextInt();
            }
        ps.println();

        ps.print("Enter number of rows in the SECOND matrix:\n" + " > ");
        int rowsMatrixTwo = input.nextInt();

        ps.print("Enter number of columns in the SECOND matrix:\n" + " >  ");
        int columnsMatrixTwo = input.nextInt();
        int matrixTwo[][] = new int[rowsMatrixTwo][columnsMatrixTwo];

        ps.println("Please enter elements in the SECOND matrix: ");
        for(int i = 0; i < rowsMatrixTwo; i++)
            for(int j = 0; j < columnsMatrixTwo; j++) {
                ps.print("> ");
                matrixTwo[i][j] = input.nextInt();
            }
        input.close();
        ps.println();
        printMatrix(multiplyMatrix(matrixOne,matrixTwo));
    }

    /**
     * @param A The first matrix to multiply
     * @param B The second matrix to multiply
     * @return Returns the product of two matrices
     */
    private int[][] multiplyMatrix(int[][] A, int[][]B){
        int mA = A.length;
        int nA = A[0].length;
        int mB = B.length;
        int nB = B[0].length;
        if(nA != mB){
            throw new RuntimeException("Illegal matrix dimensions." +
                    " Make sure the matrices are the same dimensions");
        }
        int[][]C = new int[mA][nB];
        for (int i = 0; i < mA; i++){
            for (int j = 0; j < nB; j++){
                for(int k = 0; k < nA; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        return C;

    }

    /**
     * @param A A scalar value
     * @param matrix A matrix to multiply by a scalar value
     * @return Returns the scalar multiplied matrix
     */
    private int[][] multiplyScalar(int A, int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = A* matrix[i][j];
            }
        }
        return matrix;
    }


    /**
     * @param A The first matrix to add.
     * @param B The second matrix to add
     * @return Returns the result of two added matrices.
     */
    private int[][] addMatrix(int[][]A, int[][]B){
        int m = A.length;
        int n = A[0].length;
        int[][]C = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j=0; j < n; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

}
