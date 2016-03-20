package week5.Q1.MyLibraryDomain;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }


}
