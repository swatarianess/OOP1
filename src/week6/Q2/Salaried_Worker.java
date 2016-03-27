package week6.Q2;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class Salaried_Worker extends Worker {

    private int hours;

    public Salaried_Worker(String name, int salary, int hours) {
        super(name, salary);
        this.hours = hours;
    }

    @Override
    public String toString(){
        return "| " + getName() + " | " + getSalary() + " | " + computePay(hours) + " | ";
    }

    @Override
    public double computePay(int hours){
        return getSalary();
    }

}
