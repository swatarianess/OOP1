package week3.Assignments;

import java.io.PrintStream;

/**
 * Write an application rolling a six-sided dice and showing the results on the console.
 */

/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q2 {

    private static final PrintStream ps = System.out;

    public static void main(String[] args) {
        int dieType = Integer.parseInt(args[0]);
        int timesToThrow = Integer.parseInt(args[1]);

        if(args[0] != null && args[1]!=null) {
            if (timesToThrow <= 1) {
                ps.println("Please enter a positive integer");
            }
            if(timesToThrow > 1){
                roll(timesToThrow,dieType);
            }
        } else {
            ps.println("Please enter parameters.");
        }
    }


    /**
     * @param times The amount of rolls of said die type.
     * @param die The type of die to be thrown.
     */
    public static void roll(int times, int die) {
        int[] count = new int[die];

        for (int j = 0; j < times; j++) {
            int roll = count(die);
            count[roll - 1]++;
        }

        for (int i = 0; i < die; i++){
            System.out.println((i + 1) + " appeared: " + count[i] + " times.");
        }
    }

    public static int count(int die) {
        return (int) (1 + die * Math.random());
    }

}
