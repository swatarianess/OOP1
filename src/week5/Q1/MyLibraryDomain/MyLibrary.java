package week5.Q1.MyLibraryDomain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class MyLibrary {
    private Book[] library;

    public MyLibrary(Book... library) {
        this.library = library;
    }

    public String[] getTitles(){
        String[] titles = new String[library.length];
        for (int i = 0; i < library.length; i++) {
            Book mb = library[i];
            titles[i] = mb.getTitle();
        }
        return titles;
    }

    public String[] getAuthors(){
        String[] authors = new String[library.length];
        for (int i = 0; i < library.length; i++) {
            Book mb = library[i];
            authors[i] = mb.getAuthor();
        }
        return authors;
    }

    public void addBook(String title, String author){
        List<Book> list = Arrays.asList(library);
        list.add(new Book(title,author));

        library = list.toArray(new Book[list.size()]);
    }


}
