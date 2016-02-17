package week4.Q2;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;


public class Palindrome {

    private static final PrintStream ps = System.out;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        String input;
        ps.println("##### Palindrome Check #####");
        ps.println("Please enter a word: ");
        input = in.nextLine();
        ps.println("> " + input  + " is a " + isPalindrome(input) + " palindrome");
    }

    public static boolean isPalindrome(String sentence){
        StringBuilder s = new StringBuilder();
        s.append(sentence).reverse();
        return Objects.equals(s.toString(), sentence);
    }

}
