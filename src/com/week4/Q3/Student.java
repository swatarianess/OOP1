package com.week4.Q3;

import java.util.Date;

/**
 * Created by Steve on 28/01/2016.
 */
public class Student {

    private int number;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;


    public Student(int number, String firstName, String lastName, Date dateofBirth){
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateofBirth;
    }

    public int getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
