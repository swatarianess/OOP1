package week4.Q5;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class Population {

    Route[] routes;

    public Population(int populationSize, boolean initialise) {
        routes = new Route[populationSize];

        if (initialise) {
            // Loop and create individuals
            for (int i = 0; i < populationSize(); i++) {
                Route newRoute = new Route();
                newRoute.generateIndividual();
                saveRoute(i, newRoute);
            }
        }

    }

    /**
     * @param index The index of the route to save
     * @param route The route to save
     */
    public void saveRoute(int index, Route route) {
        routes[index] = route;
    }

    /**
     * @param index The index of a route in the routes array
     * @return Returns the route in the specified index
     */
    public Route getRoute(int index) {
        return routes[index];
    }

    /**
     * @return Returns the best route
     */
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

    /**
     * @return Returns the size of the route
     */
    public int populationSize() {
        return routes.length;
    }
}