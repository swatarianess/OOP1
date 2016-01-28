package com.week4.Q1;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by swatarianess on 28/01/2016.
 */
public class sumOfYear {

    private static Person p1 = new Person(1992);
    private static Person p2 = new Person(1995);
    private static Person p3 = new Person(1996);
    private static Date date = new Date();
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy");


    private static PrintStream ps = System.out;

    public sumOfYear(){

    }

    public static int sumOfAges(Person... m){
        //Calculate the ages of people?
        int currentYear = Integer.parseInt(dateFormat.format(date));
        int sum = 0;
        for (Person aM : m) {
            int difference = currentYear - aM.getYear();
            ps.println("Person: ");
            ps.println("Y: " + aM.getYear());
            ps.println("Age:" + difference);
            sum += difference;
        }

        return sum;
    }

    public static void main(String[] args){
        ps.print(sumOfAges(p1,p2,p3));
    }

}
