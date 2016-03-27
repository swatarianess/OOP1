package week5.Q4_Q5_Q6_Q7;

import java.io.PrintStream;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class TravellingSalesman {

    private static PrintStream ps = System.out;

    static City c = new City("Amsterdam",   23, 741636, 825080);
    static City c1 = new City("Rotterdam",  23, 598199, 625472);
    static City c2 = new City("The Hague",  23, 474292, 515076);
    static City c3 = new City("Utrecht",    23, 290529, 335089);
    static City c4 = new City("Eindhoven",  23, 209620, 223876);
    static City c5 = new City("Tilburg",    23, 199613, 211726);
    static City c6 = new City("Groningen",  23, 181194, 200210);
    static City c7 = new City("Almere",     23, 176432, 197318);
    static City c8 = new City("Breda",      23, 167673, 181775);
    static City c9 = new City("Nijmegen",   23, 158732, 170943);

    public static void main(String[] args){
        RouteHandler.addCities(c,c1,c2,c3,c4,c5,c6,c7,c8,c9);

        ps.println("Cities in route: " + RouteHandler.numberOfCities());
        Population pop = new Population(3,true);
        ps.println("Initial distance: " + pop.getFittest().getDistance());
        ps.printf("| %-12s | %5s | %10s | %10s | %12s | \n", "City", "Cost", "Population", "Income", "Position");
        ps.println(pop.getFittest().toString());

    }


}
