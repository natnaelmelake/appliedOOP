package movie;

public class MovieItem {
    private String title;
    private String author;


    protected MovieItem(String title, String author){
        this.title=title;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    void printDetails(){
        System.out.println("The movie name is : "+ "" + this.title);
        System.out.println("The movie author is :" + "" + this.author);
    }


}
