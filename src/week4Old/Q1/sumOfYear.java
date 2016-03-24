package week4Old.Q1;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by steve on 28/01/2016.
 */
public class sumOfYear {

    private static final Person p1 = new Person(1992);
    private static final Person p2 = new Person(1995);
    private static final Person p3 = new Person(1996);
    private static final Date date = new Date();
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy");


    private static final PrintStream ps = System.out;

    public static int sumOfAges(Person... m){
        int currentYear = Integer.parseInt(dateFormat.format(date));
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            Person aM = m[i];
            int difference = currentYear - aM.getYear();
            ps.println("Person: " + (i+1));
            ps.println("Y: " + aM.getYear());
            ps.println("Age:" + difference + "\n");
            sum += difference;
        }

        return sum;
    }

    public static void main(String[] args){
        ps.print("Sum of ages: "+ sumOfAges(p1,p2,p3));
    }

}
