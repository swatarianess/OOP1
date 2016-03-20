package week4.Q5;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class City {
    private final String name;
    private final int cost;
    private final int population;
    private final int x;
    private final int y;

    public City(String name, int cost, int population){
        this.name = name;
        this.cost = cost;
        this.population = population;
        this.x = (int) (Math.random()*10);
        this.y = (int) (Math.random()*10);
    }

    public City(String name, int cost, int population, int x, int y){
        this.name = name;
        this.cost = cost;
        this.population = population;
        this.x = x;
        this.y = y;
    }

    public City(String name){
        this.name = name;
        this.cost = (int) (Math.random()*10);
        this.population = (int) (Math.random()*10000);
        this.x = (int) (Math.random()*10);
        this.y = (int) (Math.random()*10);
    }

    public String getName() {
        return name;
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
