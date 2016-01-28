package com.week3;

import java.io.PrintStream;
/**
 * Write an application rolling a six-sided dice and showing the results on the console.
 */

public class Q3 {

    private static PrintStream ps = System.out;

    public Q3(){

    }

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
                        roll(rolls, 2);
                    }
                } else{
                    ps.println("Please select type of die.");
                }
            } else {
                ps.println("Please select positive number of throws.");
            }
        } else {
            ps.println("Please select number of throws.");
        }
    }

    /**
     * @param die int The number of sides on the dice.
     */
    public static void roll(int die){
        if(validDice(die)) {
            ps.println(String.valueOf((int) (Math.random() * 6)));
        }
    }

    /**
     * @param times int The amount of rolls of the die to be down.
     * @param die int The amount of sides to the dice.
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
     * @param die int The number of sides to a die.
     * @return Returns the valid sided-die types.
     */
    public static boolean validDice(int die){
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
     * @param rolls int Checks the amount of rolls
     * @return Returns <t>True</t> if the rolls are a positive number, <t>False</t> if the rolls are an odd number.
     */
    public static boolean positiveRolls(int rolls){
        return rolls%2==0;
    }

}
