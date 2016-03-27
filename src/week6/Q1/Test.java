package week6.Q1;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class Test {

    public static void main(String[] args){
        Executive ex = new Executive("Executive", "Principal", 500);
        Manager m = new Manager("Boss","English",250);
        Employees e = new Employees("Employee_1", "English", 125);

        System.out.println("### Week 6 Question 1 ###\n");
        System.out.printf("| %12s | %12s | %10s |\n", "Position", "Department", "Salary ($)");
        System.out.println(ex.toString());
        System.out.println(m.toString());
        System.out.println(e.toString());
        System.out.println();
        System.out.println("### End of Question ###");
    }

}
