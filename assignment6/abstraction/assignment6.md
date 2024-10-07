
Question number one:

package assignment6.abstraction;

public abstract class Computer {
    String processingSpeed;
    String operatingSystem;
    int ram;

    Computer( String processingSpeed,String operatingSystem,int ram){
        this.operatingSystem=operatingSystem;
        this.processingSpeed=processingSpeed;
        this.ram= ram;
    }

    abstract double computeCost(int ram);
    
    abstract void perform();
    abstract void displayDetails();
}


package assignment6.abstraction;

public class Desktop extends Computer{

    Desktop(String processingSpeed, String operatingSystem,int ram) {
        super(processingSpeed, operatingSystem,ram);
    }

    @Override
    void perform() {
        System.out.println("run faster than laptops in general");
    }

    @Override
    void displayDetails() {
        System.out.println("processing speed of this desktop is : " + this.processingSpeed);
        System.out.println("Operating system of this desktop is : " + this.operatingSystem);
    }

    @Override
    double computeCost(int ram) {
        return (ram * 50) + 200;
    }
    
}


package assignment6.abstraction;

public class Laptop extends Computer{

    Laptop(String processingSpeed, String operatingSystem,int ram) {
        super(processingSpeed, operatingSystem,ram);
    }

    @Override
    void perform() {
        System.out.println("run fast");
    }

    @Override
    void displayDetails() {
        System.out.println("processing speed of this laptop is : " + this.processingSpeed);
        System.out.println("Operating system of this laptop is : " + this.operatingSystem);
    
    }

    @Override
    double computeCost(int ram) {
        return ram*50;
        
    }

    
}


package assignment6.abstraction;

public class AbstractionMain {
    public static void main(String[] args) {
        Computer laptop = new Laptop("2.3ghz","windows os 11",8);
        Computer desktop = new Desktop("2.8ghz","windows os 10",16);


        laptop.perform();
        laptop.computeCost(8);
        desktop.perform();
        desktop.computeCost(16);
        
    }
}


Question number two:

package assignment6.interfaceQuestion;

public interface ObjectBehaviour {
    void performAction();
    void haltAction();
    int getAttribute();
    String getType();
}


package assignment6.interfaceQuestion;

public class Type1 implements ObjectBehaviour{
    private final String details1;
    private final int attribute; 

    public Type1(String details1,int attribute){
        this.details1=details1;
        this.attribute=attribute;
    }

    @Override
    public void performAction() {
        System.out.println("type 1 is processing data.");
    }

    @Override
    public void haltAction() {
     System.out.println("type 1 stopped processing data.");   
    }

    @Override
    public int getAttribute() {
     return this.attribute;   
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }


    public String getDetails1() {
        return details1;
    }
    

}


package assignment6.interfaceQuestion;

public class Type2 implements ObjectBehaviour{

    private final String details2;
    private final int attribute; 

    public Type2(String details2,int attribute){
        this.details2=details2;
        this.attribute=attribute;
    }

    

    @Override
    public void performAction() {
    System.out.println("type 2 is analying data.");    
    }

    @Override
    public void haltAction() {
    System.out.println("type 2 stopped analyzing data.");    
    }

    @Override
    public int getAttribute() {
    return this.attribute;   
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();   
    }

    public String getDetails2() {
        return details2;
    }
    
}


package assignment6.interfaceQuestion;

public class Type3 implements ObjectBehaviour{

    private final String details3;
    private final int attribute; 

    public Type3(String details3,int attribute){
        this.details3=details3;
        this.attribute=attribute;
    }

    @Override
    public void performAction() {
       System.out.println("type is executing data.");
    }

    @Override
    public void haltAction() {
    System.out.println("type 3 has stopped executing data.");   
    }

    @Override
    public int getAttribute() {
        return this.attribute;  
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

    public String getDetails3() {
        return details3;
    }
    
}

package assignment6.interfaceQuestion;
import java.util.ArrayList;

public class interfaceRunner {
    public static void main(String[] args) {
        ObjectBehaviour t1 = new Type1("this is type 1 object", 100);
        ObjectBehaviour t2 = new Type2("this is type 2 object", 200);
        ObjectBehaviour t3 = new Type3("this is type 3 object", 300);

        ArrayList<ObjectBehaviour> list = new ArrayList<ObjectBehaviour>();

        list.add(t1);
        list.add(t2);
        list.add(t3);


        for (ObjectBehaviour obj : list) {
            System.out.println("--------------------------------------------");
            System.out.println(obj.getType());
            obj.performAction();
            System.out.println(obj.getAttribute());
        }

    }
}


Question number 3:


package assignment6.question3;

final class BaseFinalClass {
    
}


package assignment6.question3;

public class ParentClass {
    private int id;
    private String name;

    public ParentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void showDetails(){
        System.out.println("id is : " + this.id);
        System.out.println("name is : " + this.name);
    }    
}


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

















