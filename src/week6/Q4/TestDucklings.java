package week6.Q4;

import week6.Q4.pond.RubberDuck;
import week6.Q4.pond.TameDuck;
import week6.Q4.pond.WildDuck;
import week6.Q4.pond.WoodenDuck;

/**
 * Created by Stephen Adu on 26/03/2016.
 */
public class TestDucklings {

    public static void main(String[] args){
        RubberDuck rubberDuck = new RubberDuck();
        TameDuck tameDuck = new TameDuck();
        WildDuck wildDuck = new WildDuck();
        WoodenDuck woodenDuck = new WoodenDuck();

        System.out.println("### Week 6 Question 4 ###");
        rubberDuck.quack();
        tameDuck.quack();
        wildDuck.quack();
        woodenDuck.swim();
        System.out.println("### End of Question 4 ###");

    }
}
