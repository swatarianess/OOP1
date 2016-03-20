package week4.Q3;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class Person {

    private final String name;
    private final String lastName;

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
