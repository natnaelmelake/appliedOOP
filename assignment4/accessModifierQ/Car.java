package assignment4.accessModifierQ;

public class Car extends Vehicle{
    private String carType;
    public Car(String name, int numberOfTyres, int model, double price, int warrantyYears,String carType) {
        super(name, numberOfTyres, model, price, warrantyYears);
        this.carType=carType;
    }

    public void displayDetails(){
        System.out.println("Car Name: " + name); 
        System.out.println("Number of Tyres: " + getNumberOfTyres());  
        System.out.println("Model: " + getModel()); 
        System.out.println("Price: " + price); 
        System.out.println("Warranty Years: " + warrantyYears);  
        System.out.println("Car Type: " + carType);  
    }

    public String getCarType() {
        return carType;
    }


    public static void main(String[] args) {
        System.out.println("--------------------demo of different access modifiers------------------------");
        Car car1 = new Car("Toyota", 4, 2020, 18000, 10, "corrola");
        car1.displayDetails();
    }



    
}
