package week6.Q1;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class Employees {

    private String name;
    private String dep;
    private int salary;

    public Employees(String name, String department, int salary){
        this.name = name;
        this.dep = department;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getDep() {
        return this.dep;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString(){

        return String.format("| %-12s | %-12s | %-10s |", name, dep, salary);
    }
}
