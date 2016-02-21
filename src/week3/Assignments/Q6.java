package week3.Assignments;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q6 {

    private static final PrintStream ps = System.out;
    private static final Scanner in = new Scanner(System.in);
    private static final StringBuilder reverse = new StringBuilder();


    public static void main(String[] args){
        ps.print("Please enter words:");
        reverse.append(in.nextLine().toLowerCase());
        ps.print(reverse.reverse());
    }
}
