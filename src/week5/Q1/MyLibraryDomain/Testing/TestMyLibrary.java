package week5.Q1.MyLibraryDomain.Testing;

import week5.Q1.MyLibraryDomain.Book;
import week5.Q1.MyLibraryDomain.MyLibrary;

import java.util.Arrays;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class TestMyLibrary {

    public TestMyLibrary(){

    }

    public static void main(String[] args){
        Book b = new Book("Title 1","Author 1");
        Book c = new Book("Title 2","Author 2");
        Book d = new Book("Title 3","Author 3");
        Book e = new Book("Title 4","Author 4");
        Book f = new Book("Title 5","Author 5");
        Book g = new Book("Title 6","Author 6");

        MyLibrary lib = new MyLibrary(b, c, d, e, f, g);

        System.out.println(Arrays.toString(lib.getTitles()));
        System.out.println(Arrays.toString(lib.getAuthors()));

    }

}
