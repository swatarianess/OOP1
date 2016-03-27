package week6.Q2;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class Worker {

    private String name;
    private int salary;

    public Worker(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    /**
     * @param hours The number of hours worked
     * @return The total weekly earnings
     */
    public double computePay(int hours){
        double overTime = 1.5;
        int sc = hours * salary;
        double scOver = ((hours - 40) * salary * overTime) + sc;


        if(hours < 40) {
            return sc;
        } else {
            return (scOver);
        }

    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

}
