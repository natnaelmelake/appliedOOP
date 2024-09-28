package assignment5;

public class ElectricCar extends Car{

    private String batteryLevel;

    public ElectricCar(String name, int numberOfTyres, int modelYear, double sellingPrice,String batteryLevel) {
        super(name, numberOfTyres, modelYear, sellingPrice);
        this.batteryLevel=batteryLevel;
    }

    public String getBatteryLevel() {
        return batteryLevel;
    }

    void chargeBattery(){
        if(this.batteryLevel.equals("FULL")){
            System.out.println("it is fully charged!!!");
        }
        else if(this.batteryLevel.equals("LOW")){
            System.out.println("Charging battery");
        }
    }

    
}
