package week3;

import java.io.PrintStream;
/**
 * Write an application rolling a six-sided dice and showing the results on the console. First param rolls, second param die type.
 */

public class Q3 {

    private static PrintStream ps = System.out;

    public static void main(String[] args) {
        int rolls = Integer.parseInt(args[0]);
        int dieType = Integer.parseInt(args[1]);

        if((args[0] != null)) {
            if(positiveRolls(rolls)){
                if(args[1] != null) {

                    if (rolls <= 1) {
                        roll(dieType);
                    }

                    if (rolls > 1) {
                        roll(rolls, dieType);
                    }
                } else {
                    ps.println("Please select type of die.");
                }
            } else {
                ps.println("Please select positive number of throws.");
            }
        } else {
            ps.println("Please select valid number of throws.");
        }
    }

    /**
     * @param die The number of sides on the dice.
     */
    private static void roll(int die){
        if(validDice(die)) {
            ps.println(String.valueOf((int) (Math.random() * 6)));
        }
    }

    /**
     * @param times The amount of rolls of the die to be down.
     * @param die int The amount of sides to the dice.
     */
    private static void roll(int times, int die){
        if(times <= 10) {
            if(validDice(die)){
                for (int i = 0; i < times; i++) {
                    ps.println(String.valueOf((int) (Math.random() * die)+1));
                }
            } else {
                ps.println("Not a valid die. Please select either 4,6,8,12,20,30,100-sided dice.");
            }
        } else {
            ps.println("Cannot be thrown more than 10 times");
        }
    }

    /**
     * @param die The number of sides to a die.
     * @return Returns the valid sided-die types.
     */
    private static boolean validDice(int die){
        switch(die){
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 20:
            case 30:
            case 100:
                return true;

            default:
                return false;
        }
    }

    /**
     * @param rolls Checks the amount of rolls
     * @return Returns <t>True</t> if the rolls are a positive number, <t>False</t> if the rolls are an odd number.
     */
    private static boolean positiveRolls(int rolls){return rolls > 0 && rolls%2==0;}

}
