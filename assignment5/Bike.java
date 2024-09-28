package assignment5;

public class Bike extends Vehicle{
    private String typeOfBike;

    public Bike(String name, int numberOfTyres, int modelYear,String typeOfBike) {
        super(name, numberOfTyres, modelYear);
        this.typeOfBike=typeOfBike;
    }

    @Override
    public void displayInfo() {
        System.out.println("displaying bike info");
        super.displayInfo();
        System.out.println("type of bike : " + typeOfBike);
    }
   
}
