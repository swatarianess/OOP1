package week3.Assignments;

import java.io.PrintStream;

/*
 * Write an application rolling a six-sided dice and showing the results on the console.
 */

/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q1 {

    private static PrintStream ps = System.out;

    public static void main(String[] args) {
        int sixSidedDice = 6;
        ps.println(String.valueOf((int) (Math.random() * sixSidedDice)));
    }


}
