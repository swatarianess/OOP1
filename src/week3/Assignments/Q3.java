package week3.Assignments;

import java.io.PrintStream;
/**
 * Write an application rolling a six-sided dice and showing the results on the console. First param rolls, second param die type.
 */
/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q3 {

    private static final PrintStream ps = System.out;

    public static void main(String[] args) {
        int rolls = Integer.parseInt(args[0]);
        int dieType = Integer.parseInt(args[1]);
        Q3 q = new Q3();

        if((args[0] != null)) {
            if(q.positiveRolls(rolls)){
                if(args[1] != null) {
                    q.roll(rolls, dieType);
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

    private void roll(int times, int die){
        if(validDice(die)) {
            int[] count = new int[die];

            for (int j = 0; j < times; j++) {
                int roll = count(die);
                count[roll - 1]++;
            }

            for (int i = 0; i < die; i++) {
                System.out.println((i + 1) + " appeared: " + count[i] + " times.");
            }
        } else {
            ps.println("Not a valid die. Please select either 4,6,8,12,20,30,100-sided dice.");
        }
    }

    public int count(int die) {
        return (int) (1 + die * Math.random());
    }


    /**
     * @param die The number of sides to a die.
     * @return Returns the valid sided-die types.
     */
    private boolean validDice(int die){
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
    private boolean positiveRolls(int rolls){return rolls %2 == 0;}

}
