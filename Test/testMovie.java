package Test;

import movie.Movie;
import movie.MovieItem;

public class testMovie extends MovieItem{

   public testMovie(String title, String author) {
        super(title, author);
    }

public static void main(String[] args) {

    Movie movie1= new Movie();
    MovieItem item1 = new testMovie("Lord of the Rings", "Tolkien");
    MovieItem item2 = new testMovie("Titanic", "james");


    movie1.addMovieItem(item1);
    movie1.addMovieItem(item2);

    movie1.printMovieDetails();
    

   }
    
}
