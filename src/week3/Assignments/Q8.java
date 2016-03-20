package week3.Assignments;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q8 {

    private static final Scanner input = new Scanner(System.in);
    private static final PrintStream ps = System.out;

    public static void main(String[] main){
        System.out.println("How many rows do you want to have? ");
        int rows = input.nextInt();
        generateRows(rows);
    }

    private static void generateRows(int rows){
        for (int i = 0; i < rows; i++) {
            int nextNumber = 1;

            for (int j = 0; j <= i; j++) {
               ps.format("%4d", nextNumber);
                nextNumber = nextNumber * (i - j) / (j + 1);
            }

            ps.println();
        }
    }

}
