package week4.Q4;

import java.util.ArrayList;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class Teacher {

    private final String firstName;
    private final String lastName;
    private ArrayList<Course> courses;

    public Teacher(String firstName, String lastName, ArrayList<Course> courses){
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }

    public String getFullName(){
        return firstName+" "+lastName;
    }

    public void addCourse(Course c){
        this.courses.add(c);
    }

    public void removeCourse(Course c){
       this.courses.remove(c);
    }


}
