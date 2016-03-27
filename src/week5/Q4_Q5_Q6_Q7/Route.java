package week5.Q4_Q5_Q6_Q7;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class Route {

    private ArrayList<City> Route = new ArrayList<>();

    private double fitness = 0;
    private int distance = 0;

    // Constructs a blank tour
    public Route(){
        for (int i = 0; i < RouteHandler.numberOfCities(); i++) {
            Route.add(null);
        }
    }

    public Route(ArrayList<City> route){
        this.Route = route;
    }

    public void generateIndividual() {
        for (int cityIndex = 0; cityIndex < RouteHandler.numberOfCities(); cityIndex++) {
            setCity(cityIndex, RouteHandler.getCity(cityIndex));
        }
        Collections.shuffle(Route);
    }

    public City getCity(int tourPosition) {
        return Route.get(tourPosition);
    }

    public void setCity(int tourPosition, City city) {
        Route.set(tourPosition, city);
        fitness = 0;
        distance = 0;
    }

    public double getFitness() {
        if (fitness == 0) {
            fitness = 1/(double)getDistance();
        }
        return fitness;
    }

    // Gets the total distance of the tour
    public int getDistance(){
        if (distance == 0) {
            int tourDistance = 0;
            for (int cityIndex=0; cityIndex < tourSize(); cityIndex++) {
                City fromCity = getCity(cityIndex);
                City destinationCity;
                if(cityIndex+1 < tourSize()){
                    destinationCity = getCity(cityIndex+1);
                }
                else{
                    destinationCity = getCity(0);
                }
                tourDistance += fromCity.distanceTo(destinationCity);
            }
            distance = tourDistance;
        }
        return distance;
    }

    public int tourSize() {
        return Route.size();
    }

    public boolean containsCity(City city){
        return Route.contains(city);
    }

    @Override
    public String toString() {
        String geneString = "";
        for (int i = 0; i < tourSize(); i++) {
            geneString += getCity(i).getDetails() + "\n";
        }
        return geneString;
    }
}
