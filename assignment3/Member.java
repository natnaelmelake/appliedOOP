package assignment3;
import java.util.ArrayList;
public class Member {

    public String name;
    private String memberID;
    private ArrayList<Book> borrowedBooks;

    public Member(String name,String memberID){
        this.memberID=memberID;
        this.name=name;   
        this.borrowedBooks=new ArrayList<Book>();
    }

    public String getMemberID() {
        return memberID;
    }

    public void borrowBook(Book book){
        addBookToBorrowedList(book);;
    }

    private void addBookToBorrowedList(Book book){
        this.borrowedBooks.add(book);
    }
    
}
