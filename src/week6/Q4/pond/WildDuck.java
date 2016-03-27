package week6.Q4.pond;

import week6.Q4.interfaces.Flyable;
import week6.Q4.interfaces.Quackable;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class WildDuck extends Duck implements Quackable, Flyable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly(){
        System.out.println("*Flaps wings*");
    }
}
