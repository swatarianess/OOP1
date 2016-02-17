package week3.old;

import java.io.PrintStream;

/*
 * Write an application rolling a six-sided dice and showing the results on the console.
 */
public class Q1 {

    private static PrintStream ps = System.out;

    public static void main(String[] args) {
        int sixSidedDice = 6;
        ps.println(String.valueOf((int) (Math.random() * sixSidedDice)));
    }


}
