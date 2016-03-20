package week4.Q2;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class Teacher {

    private final String firstName;
    private final String lastName;

    public Teacher(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName+" "+lastName;
    }
}
