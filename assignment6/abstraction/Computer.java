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
