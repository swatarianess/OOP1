package week3;

import java.io.PrintStream;

/**
 * Created by swatarianess on 28/01/2016.
 */
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
