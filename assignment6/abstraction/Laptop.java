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
