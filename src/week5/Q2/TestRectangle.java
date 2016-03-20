package week5.Q2;

import java.awt.*;
import java.io.PrintStream;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class TestRectangle {

    private static PrintStream ps = System.out;
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5);
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(5);

        Rectangle r4 = new Rectangle(5,6);
        Rectangle r5 = new Rectangle(5);
        Rectangle r6 = new Rectangle(5);

        ps.println("Counter: " + Rectangle.getCounter());
        ps.println("Rectangle 1 color: "+ r1.getColor());
        ps.println("Rectangle 2 Height: "+ r2.getHeight());
        ps.println("Rectangle 3 width: "+ r3.getWidth());

        r4.setColor(Color.pink);
        ps.println("Rectangle 4 color: "+ r4.getColor());

        r5.setHeight(10);
        ps.println("Rectangle 5 height: "+ r5.getHeight());

        r6.setWidth(25);
        ps.println("Rectangle 6 width: "+ r6.getWidth());

    }
}
