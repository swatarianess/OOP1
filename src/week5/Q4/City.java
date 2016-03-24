package week5.Q4;

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

    public String getDetails(){ return "| " + name + " | Cost: " + cost + " | Pop: " +
            Integer.toString(population) + " | pos: (" + x + "," + y + ") |"  ; }

    public int getIncome(){
        return income;
    }

    public int getCost(){
        return cost;
    }

    public int getPopulation(){
        return population;
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
