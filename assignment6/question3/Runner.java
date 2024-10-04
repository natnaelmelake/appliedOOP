package assignment6.question3;

public class Runner {
    public static void main(String[] args) {
        
        ParentClass pc = new ParentClass(10, "nathan");
        ChildClass1 ch1 = new ChildClass1(1, "natnael", "1767");
        ChildClass2 ch2 = new ChildClass2(20, "abiti", "2002");

        pc.showDetails();
        System.out.println("------------------------------------------------");
        ch1.showDetails();
        System.out.println("------------------------------------------------");
        ch2.showDetails();
    }
}
