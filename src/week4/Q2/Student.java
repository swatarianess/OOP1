package week4.Q2;

import java.util.Date;

/**
 * Created by Steve on 28/01/2016.
 */
public class Student {

    private final int number;
    private final String firstName;
    private final String lastName;
    private final Date dateOfBirth;

    public Student(int number, String firstName, String lastName, Date dateOfBirth){
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

}
