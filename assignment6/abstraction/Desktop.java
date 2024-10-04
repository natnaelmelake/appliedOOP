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
