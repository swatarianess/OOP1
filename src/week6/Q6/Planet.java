package week6.Q6;

/**
 * Created by Stephen Adu on 27/03/2016.
 */
public class Planet implements Rotatable {

    private long distanceToSun;

    public Planet(long distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    @Override
    public String rotateAroundSun() {
        return Long.toString(distanceToSun);
    }

}
