package week3.Combination;

/**
 * Created by Reall_blue on 17/02/2016.
 * Project: OOP_ClassProjects
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicsOfJavaSyntax {

    private static Scanner sr = new Scanner(System.in);

    public static void main(String[] args){
        BasicsOfJavaSyntax boj = new BasicsOfJavaSyntax();

        boj.printMessage("## 02- Basics of Java syntax ##");
        boj.printMessage("1. Apple => ",boj.apple());
        boj.printMessage("2. Box => ", boj.box());
        boj.printMessage("3. Special characters =>", boj.specialCharacters());
        boj.printMessage("4. Using StringBuilder =>", boj.specialCharacters(new StringBuilder()));
        boj.printMessage("5. The Finger =>", boj.theFinger());
        boj.printMessage("Please enter a number to check question 6. => ");
        int primeNumber = sr.nextInt();
        boj.printMessage("6. Prime checker => " + boj.primesUpTo(primeNumber));
    }

    private String apple(){
        double apple = 2.25;
        double euro = 0.747161;
        return String.valueOf(apple * euro);
    }

    private String box(){
        int length = 5;
        int width = 5;
        int height = 5;
        return String.valueOf(length * width * height);
    }

    private String specialCharacters(StringBuilder sb){
        return sb.append("Java™\n")
                .append("The formula for the circumference of a circle is 2πr.\n")
                .append("The formula for the area of a circle is πr²\n")
                .append("So a circle with a radius of 3 has a circumference of ")
                .append((2 * Math.PI * 3))
                .append("\n")
                .append("and an area of ")
                .append(Math.PI * (Math.pow(3, 2))).toString();
    }

    private String specialCharacters(){
        String p = "";
        return p.concat("Java™\n")
                .concat("The formula for the circumference of a circle is 2πr.\n")
                .concat("The formula for the area of a circle is πr²\n")
                .concat("So a circle with a radius of 3 has a circumference of ")
                .concat(String.valueOf(2 * Math.PI * 3))
                .concat("\n")
                .concat("and an area of ")
                .concat(String.valueOf(Math.PI * (Math.pow(3, 2))));
    }


    private String theFinger(){
        StringBuilder s = new StringBuilder();
        s.append("....................../´¯/)\n")
                .append("....................,/¯../\n")
                .append(".................../..../\n")
                .append("............./´¯/'...'/´¯¯`·¸\n")
                .append("........../'/.../..../......./¨¯\\ \n")
                .append("........('(...´...´.... ¯~/'...') \n")
                .append(".........\\.................'...../ \n")
                .append("..........''...\\.......... _.·´\n")
                .append("............\\..............(\n")
                .append("..............\\.............\\...\n");

        return s.toString();
    }

    private String primeCheck(final int x){
        int[] p = new int[x];
        ArrayList<Integer> s = new ArrayList<>();

        if(x < 2){
            return "Enter number greater than two.";
        }

        for(int i=0; i < p.length; i++){
            p[i] = i+1;
        }

        for(int i=4; i < p.length; i++){
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if (i % 2 == 0) {
                    p[i - 1] = 0;
                }
            }
        }

        for (int aP : p) {
            if (aP != 0) {
                s.add(aP);
            }
        }

        return s.toString();
    }

    private List<Integer> primesUpTo(final int arg) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i < arg; i++) {
            boolean b = true;
            for (Integer j : res) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                res.add(i);
            }
        }
        return res;
    }


    private void printMessage(final String... strings){
        for(String s: strings){
            System.out.println(s);
        }
        System.out.print("\n");
    }

}

