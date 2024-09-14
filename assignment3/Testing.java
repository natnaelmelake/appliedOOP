package assignment3;

public class Testing {
    public static void main(String[] args) {

        System.out.println("------------------testing book------------------------");
        Book book1=new Book("xyz", "Natnael", "12345", 10);
        Book book2=new Book("abc", "Nathan", "54321", 5);

        System.out.println("author is : " + book1.author + " " + "title is:" + book1.title + " " + " number of copies available : " + book1.getCopiesAvailable());
        System.out.println("-------------------testing Member ---------------------------");
        
        Member member1=new Member("Delina", "1");

        System.out.println("Member ID : " + member1.getMemberID());
        member1.borrowBook(book2);
        System.out.println("------------------------testing Library---------------------");

        Library libraryIuea=new Library();

        libraryIuea.addBook(book2);
        libraryIuea.addBook(book1);
        libraryIuea.registerMember(member1);
        libraryIuea.lendBook("54321", member1.getMemberID());



    }
}
