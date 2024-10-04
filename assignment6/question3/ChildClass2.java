package assignment6.question3;

public class ChildClass2 extends ParentClass{
    private String year;

    public ChildClass2(int id, String name,String year) {
        super(id, name);
        this.year=year;
    }
    
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("year is : " + this.year);
    }

    
    
}
