package week6.Q2;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class HourlyWorker extends Worker {

    private int hours;

    public HourlyWorker(String name, int salary, int hours) {
        super(name, salary);
        this.hours = hours;
    }

    @Override
    public String toString(){
        return String.format("| %10s | %8s | %10.2f |", getName(), getSalary(), computePay(hours));
    }

}
