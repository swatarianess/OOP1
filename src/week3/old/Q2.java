package week3.old;

import java.io.PrintStream;
/**
 * Write an application rolling a six-sided dice and showing the results on the console.
 */

public class Q2 {

    private static PrintStream ps = System.out;

    public static void main(String[] args) {
        int timeToThrow = Integer.parseInt(args[0]);
        int dieType = Integer.parseInt(args[1]);
        if(args[0] != null && args[1]!=null) {
            if (timeToThrow <= 1) {
                roll(dieType);
            }
            if(timeToThrow > 1){
                roll(timeToThrow,dieType);
            }
        } else {
            roll(dieType);
        }
    }


    /**
     * @param die The type of die to be thrown.
     */
    public static void roll(int die){
        if(validDice(die)) {
            ps.println(String.valueOf((int) (Math.random() * 6)));
        }
    }

    /**
     * @param times The amount of rolls of said die type.
     * @param die The type of die to be thrown.
     */
    public static void roll(int times, int die){
        if(times <= 10) {
            if(validDice(die)){
                for (int i = 0; i < times; i++) {
                    ps.println(String.valueOf((int) (Math.random() * die)+1));
                }
            } else {
                ps.println("Not a valid die. Please select 4-sided or 6-sided.");
            }
        } else {
            ps.println("Cannot be thrown more than 10 times");
        }
    }

    /**
     * @param die The type of die being used.
     * @return Returns whether the dice is one of the accepted sidede ones.
     */
    public static boolean validDice(int die){
        switch(die){
            case 4:
            case 6:
                return true;
            default:
                return false;
        }
    }

}
