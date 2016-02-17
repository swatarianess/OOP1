package week3.old;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Reall_blue on 17/02/2016.
 * Project: OOP_ClassProjects
 */
public class Q7 {

    private PrintStream ps = System.out;

   public static void main(String[] args){

   }

   public String generateGrid(int width, int height){
       String chosen = "|X|";
       String gap = "| |";
       String breakPoint = "--------------";
       ArrayList<String> s = new ArrayList<>();
       StringBuilder a = new StringBuilder();

       for(int i = 0; i < height;i++){
           s.add(i,breakPoint);
           for(int j =0; j < width; j++) {
               s.add(i + 1, generateRandomX(chosen, gap));
           }
       }

       return s.toString();
   }

    private String generateRandomX(String option1, String option2){
        Random r = new Random();
        if(r.nextBoolean()){
            return option1;
        } else {
            return option2;
        }
    }

}
