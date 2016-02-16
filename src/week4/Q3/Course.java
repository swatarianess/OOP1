package week4.Q3;

/**
 * Created by swatarianess on 28/01/2016.
 */
public class Course {

    private int code;
    private int credits;
    private String name;

    public Course(int code, int credits, String name){
        this.code = code;
        this.credits = credits;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    public String getName() {
        return name;
    }
}
