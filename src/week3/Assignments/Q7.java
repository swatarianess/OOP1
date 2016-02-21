package week3.Assignments;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q7 {

    private static PrintStream ps = System.out;

   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       ps.println("Please enter: Width and Height");
       String[] widthAndHeight = (input.nextLine().split(" "));
       input.close();
        ps.print(generateGrid(Integer.valueOf(widthAndHeight[0]),Integer.valueOf(widthAndHeight[1])));
   }

   public static StringBuilder generateGrid(int width, int height){
       String breakPoint = "-------------";
       StringBuilder a = new StringBuilder();

       for(int i = 0; i < height;i++){
           a.append(breakPoint).append("\n");
           for(int j =0; j < width; j++) {
               a.append(generateRandomX("|X|", "| |"));
           }
           a.append("\n");
       }

       return a;
   }

    private static String generateRandomX(String option1, String option2){
        Random r = new Random();
        if(r.nextBoolean()){
            return option1;
        } else {
            return option2;
        }
    }

}
