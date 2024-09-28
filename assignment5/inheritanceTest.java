package assignment5;

public class inheritanceTest {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 4, 2020, 10000);
        ElectricCar ec1 = new ElectricCar("Tesla", 4, 2024, 30000,"FULL");
        Bike bike = new Bike("Mountain", 2, 2020, "road bike");


        c1.displayInfo();
        c1.drive();
        System.out.println(ec1.getBatteryLevel());
        ec1.chargeBattery();
        bike.displayInfo();


    }
}
