package week5.Q2;

import java.awt.*;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class Rectangle {
    private int width;
    private int height;
    private Color color;
    private static int counter = 0;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        this.color = Color.BLUE;
        counter++;
    }

    public Rectangle(int value){
        this.width = value;
        this.height = value;
        this.color = Color.BLUE;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
