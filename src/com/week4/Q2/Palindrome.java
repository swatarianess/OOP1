package com.week4.Q2;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by swatarianess on 28/01/2016.
 */
public class Palindrome {

    private static final PrintStream ps = System.out;
    private static final Scanner in = new Scanner(System.in);

    public Palindrome(){

    }

    public static void main(String[] args){
        ps.println("##### Palindrom Check #####");
        ps.println("Please enter a word: ");
        ps.println("Input is a " + isPalindrome(in.nextLine()) + " palindrome");
    }

    public static boolean isPalindrome(String sentence){
        StringBuilder s = new StringBuilder();
        s.append(sentence).reverse();
        return Objects.equals(s.toString(), sentence);
    }

}
