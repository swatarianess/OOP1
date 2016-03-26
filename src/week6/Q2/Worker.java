package week6.Q2;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class Worker {

    private String name;
    private int salary;


    /**
     * @param hours The number of hours worked
     * @param salary The amount of salary per hour
     * @return The total weekly earnings
     */
    public int computePay(int hours, int salary){
        double overTime = 1.5;
        int sc = hours * salary;
        int scOver = (int) ((hours - 40) * salary * overTime);

        if(hours < 40) {
            return sc;
        } else {
            return (scOver);
        }

    }



}
