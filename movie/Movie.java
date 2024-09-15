package movie;
import java.util.ArrayList;

public class Movie {
    private ArrayList<MovieItem> listOfMovieItem;

    public Movie(){
        this.listOfMovieItem=new ArrayList<MovieItem>();
    }

    public void addMovieItem(MovieItem item){
        this.listOfMovieItem.add(item);
    }

    public void printMovieDetails(){
        for (MovieItem movieItem : listOfMovieItem) {
            movieItem.printDetails();
        }
    }
}
