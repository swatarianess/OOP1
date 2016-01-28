package com.week3;

import java.io.PrintStream;

/*
 * Write an application rolling a six-sided dice and showing the results on the console.
 */
public class Q1 {

    private static PrintStream ps = System.out;

    public Q1(){

    }

    public static void main(String[] args) {
      ps.printf(String.valueOf((int) (Math.random() * 6)));
    }


}
