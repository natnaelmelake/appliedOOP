package assignment5;

/**
 * Vehicle
 */
public class Vehicle {

    private int numberOfTyres;
    private String name;
    private int modelYear;


    public Vehicle(String name,int numberOfTyres,int modelYear){
        this.name=name;
        this.modelYear=modelYear;
        this.numberOfTyres=numberOfTyres;
    }

    public void displayInfo(){
        System.out.println("vehicles name is : " + this.name);
        System.out.println("vehicles number of tyres : " + this.numberOfTyres);
        System.out.println("vehicles modelyear : " + this.modelYear);
    }

}