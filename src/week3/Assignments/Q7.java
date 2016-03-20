package week3.Assignments;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Stephen Adu on 17/02/2016.
 */
public class Q7 {

    private static final PrintStream ps = System.out;

    public static void main(String[] args){
        Q7 q = new Q7();

        Scanner input = new Scanner(System.in);
        ps.print("Please enter Width and Height:\n>");
        String[] widthAndHeight = (input.nextLine().split(" "));
        input.close();
        ps.print(q.generateGrid(Integer.valueOf(widthAndHeight[0]),Integer.valueOf(widthAndHeight[1])));
    }

    private StringBuilder generateGrid(int width, int height){
        String breakPoint = "-------------";
        StringBuilder a = new StringBuilder();

        for(int i = 0; i < height;i++){
            a.append(breakPoint).append("\n");
            for(int j =0; j < width; j++) {
                a.append(generateRandomX());
            }
            a.append("\n");
        }

        return a;
    }

    private String generateRandomX(){
        Random r = new Random();
        if(r.nextBoolean()){
            return "|X|";
        } else {
            return "| |";
        }
    }

}
