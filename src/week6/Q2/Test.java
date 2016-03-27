package week6.Q2;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class Test {


    public static void main(String[] args){
        HourlyWorker hw = new HourlyWorker("H_Worker 1",500,39);
        HourlyWorker hw1 = new HourlyWorker("H_Worker 2",500,40);
        HourlyWorker hw2 = new HourlyWorker("H_Worker 3",500,41);

        Salaried_Worker sw = new Salaried_Worker("S_Worker 1",500,45);

        System.out.println(hw);
        System.out.println(hw1);
        System.out.println(hw2);
        System.out.println();
        System.out.println(sw);
    }
}
