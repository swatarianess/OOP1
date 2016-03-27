package week6.Q4.pond;

import week6.Q4.interfaces.Quackable;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
