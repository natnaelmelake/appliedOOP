package assignment3;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library(){
        this.books=new ArrayList<Book>();
        this.members=new ArrayList<Member>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void registerMember(Member member){
        this.members.add(member);
    }

    public void lendBook(String isbn,String memberID){
        Book desiredBook = findBookByIsbn(isbn);
        Member desiredMember = findMemberByID(memberID);

        if (desiredBook!= null) {
            System.out.println("desired book is available");
            desiredMember.borrowBook(desiredBook);
            System.out.println("successfully borrowed book ");
            int bookCopies = desiredBook.getCopiesAvailable();
            bookCopies=bookCopies-1;
            desiredBook.setCopiesAvailable(bookCopies);
            System.out.println("Number of copies available after lending is : " + desiredBook.getCopiesAvailable());
        }

        else{
            System.out.println("desired book is not available");
        }


    }

    private Book findBookByIsbn(String isbn){
        Book desiredBook=null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                desiredBook=book;
            }
        }
        return desiredBook;
    }

    private Member findMemberByID(String memberID){
        Member desiredMember=null;
        for (Member member : members) {
            if (member.getMemberID().equals(memberID)) {
                desiredMember=member;
            }
        }
        return desiredMember;
    }
    
}
