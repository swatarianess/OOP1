package week4.Q5;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class Population {

    Route[] routes;

    public Population(int populationSize, boolean initialise) {
        routes = new Route[populationSize];
        // If we need to initialise a population of routes do so
        if (initialise) {
            // Loop and create individuals
            for (int i = 0; i < populationSize(); i++) {
                Route newRoute = new Route();
                newRoute.generateIndividual();
                saveRoute(i, newRoute);
            }
        }
    }

    // Saves a tour
    public void saveRoute(int index, Route route) {
        routes[index] = route;
    }

    // Gets a tour from population
    public Route getRoute(int index) {
        return routes[index];
    }

    // Gets the best tour in the population
    public Route getFittest() {
        Route fittest = routes[0];
        // Loop through individuals to find fittest
        for (int i = 1; i < populationSize(); i++) {
            if (fittest.getFitness() <= getRoute(i).getFitness()) {
                fittest = getRoute(i);
            }
        }
        return fittest;
    }

    public int populationSize() {
        return routes.length;
    }
}