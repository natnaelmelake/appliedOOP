package assignment6.question3;

public class ChildClass1 extends ParentClass{
    private String regNumber;

    public ChildClass1(int id, String name,String regNumber) {
        super(id, name);
        this.regNumber = regNumber;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("reg number is : " + this.regNumber);
    }
    
}
