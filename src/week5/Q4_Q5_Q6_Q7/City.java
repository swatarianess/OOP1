package week5.Q4_Q5_Q6_Q7;

import java.text.NumberFormat;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class City {
    private final String name;
    private final int cost;
    private final int population;
    private final int x;
    private final int y;
    private final int income;

    public City(String name, int cost, int population, int income){
        this.name = name;
        this.cost = cost;
        this.population = population;
        this.income = income;
        this.x = (int) (Math.random()*1000);
        this.y = (int) (Math.random()*1000);
    }

    public City(String name, int cost, int population,int income, int x, int y){
        this.name = name;
        this.cost = cost;
        this.population = population;
        this.income = income;
        this.x = x;
        this.y = y;
    }

    public City(String name){
        this.name = name;
        this.cost = (int) (Math.random()*10);
        this.population = (int) (Math.random()*10000);
        this.income = (int)(Math.random()*1000);
        this.x = (int) (Math.random()*10);
        this.y = (int) (Math.random()*10);
    }

    public String getName() {
        return name;
    }

    public String getDetails(){
        return String.format("| %-12s | %5s | %10s | %10s | (%d,%d)%5s ",
                name, cost, NumberFormat.getNumberInstance().format(population), NumberFormat.getNumberInstance().format((income)), x, y," |");
    }

    public double distanceTo(City city){
        int xDistance = Math.abs(getX() - city.getX());
        int yDistance = Math.abs(getY() - city.getY());

        return Math.sqrt( ( Math.pow(xDistance,2)) + (Math.pow(yDistance,2)));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
