package week5.Q4;

import java.io.PrintStream;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class TravellingSalesman {

    private static PrintStream ps = System.out;

    static City c = new City("Amsterdam",   23, 50, 825080);
    static City c1 = new City("Rotterdam",  23, 50, 625472);
    static City c2 = new City("The Hague",  23, 50, 515076);
    static City c3 = new City("Utrecht",    23, 50, 335089);
    static City c4 = new City("Eindhoven",  23, 50, 223876);
    static City c5 = new City("Tilburg",    23, 50, 211726);
    static City c6 = new City("Groningen",  23, 50, 200210);
    static City c7 = new City("Almere",     23, 50, 197318);
    static City c8 = new City("Breda",      23, 50, 181775);
    static City c9 = new City("Nijmegen",   23, 50, 170943);

    public static void main(String[] args){
        RouteHandler.addCity(c);
        RouteHandler.addCity(c1);
        RouteHandler.addCity(c2);
        RouteHandler.addCity(c3);
        RouteHandler.addCity(c4);
        RouteHandler.addCity(c5);
        RouteHandler.addCity(c6);
        RouteHandler.addCity(c7);
        RouteHandler.addCity(c8);
        RouteHandler.addCity(c9);

        ps.println("Cities in route: " + RouteHandler.numberOfCities());
        Population pop = new Population(3,true);
        ps.println("Initial distance: " + pop.getFittest().getDistance());
        ps.println("Route: ");
        ps.println(pop.getFittest().toString());


    }


}
