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
