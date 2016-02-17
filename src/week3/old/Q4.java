package week3.old;

import java.io.PrintStream;


public class Q4 {

    private static PrintStream ps = System.out;

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int height = Integer.parseInt(args[2]);

        long volume = length*width*height;

        ps.println(volume);
    }


}
