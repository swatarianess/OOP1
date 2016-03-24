package week5.Q4;

import java.util.ArrayList;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class RouteHandler {

    // Holds our cities
    private static ArrayList<City> destinationCities = new ArrayList<>();

    // Adds a destination city
    public static void addCity(City city) {
        destinationCities.add(city);
    }

    // Get a city
    public static City getCity(int index){
        return destinationCities.get(index);
    }

    // Get the number of destination cities
    public static int numberOfCities(){
        return destinationCities.size();
    }

}
