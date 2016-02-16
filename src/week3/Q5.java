package week3;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by swatarianess on 28/01/2016.
 */
public class Q5 {

    private static final PrintStream ps = System.out;
    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        ps.print("Select a number between 1 and 65535:");
        int unicodeID = in.nextInt();
        String s = Character.toString((char)unicodeID);
        ps.println(s);
    }

}
