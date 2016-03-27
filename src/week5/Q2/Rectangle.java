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

    /**
     * @return Returns the amount of <p> Rectangles </p>
     */
    public static int getCounter() {
        return counter;
    }

    /**
     * @return Returns the width of the <p> Rectangle </p>
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width The width to set the <p> Rectangle </p>
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return Returns the height of the <p> Rectangle </p>
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height The height to set the <p> Rectangle </p>
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return Returns the color of the <p> Rectangle </p>
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color The color to set the <p> Rectangle </p>
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
