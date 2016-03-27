package week5.Q4_Q5_Q6_Q7;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class RouteHandler {

    /**
     * Holds all the cities in an array
     */
    private static ArrayList<City> destinationCities = new ArrayList<>();

    /**
     * @param city The city to add to the route
     */
    public static void addCity(City city) {
        destinationCities.add(city);
    }

    /**
     * @param c The array of cities to add to the route
     */
    public static void addCities(City... c){
        destinationCities.addAll(Arrays.asList(c));
    }

    /**
     * @param index The index of the city to return
     * @return Returns the city in the index of the array
     */
    public static City getCity(int index){
        return destinationCities.get(index);
    }

    /**
     * @return Returns the amount of cities in the route.
     */
    public static int numberOfCities(){
        return destinationCities.size();
    }

}
