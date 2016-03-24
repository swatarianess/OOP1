package week5.Q4;

import java.io.PrintStream;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class TravellingSalesman {

    static Route route = new Route();
    private static PrintStream ps = System.out;

    static City c = new City("A", 10, 10000);
    static City c1 = new City("B", 15, 1000);
    static City c2 = new City("C", 30, 5000);
    static City c3 = new City("D", 69, 69000);
    static City c4 = new City("E", 50, 51241);

    public TravellingSalesman(){

    }

    public static void main(String[] args){
        RouteHandler.addCity(c);
        RouteHandler.addCity(c1);
        RouteHandler.addCity(c2);
        RouteHandler.addCity(c3);
        RouteHandler.addCity(c4);

        ps.println("A to B: " + c.distanceTo(c1));
        ps.println("B to C: " + c1.distanceTo(c2));
        ps.println("C to D: " + c2.distanceTo(c3));
        ps.println("D to E: " + c3.distanceTo(c4));
        ps.println("Cities in route: " + RouteHandler.numberOfCities());

        Population pop = new Population(50,true);
        ps.println("Initial distance: " + pop.getFittest().getDistance());
        ps.println("Route: ");
        ps.println(pop.getFittest().toString());


    }


}
