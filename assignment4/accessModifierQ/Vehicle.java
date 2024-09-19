package assignment4.accessModifierQ;

public class Vehicle {
    String name;
    private int numberOfTyres;
    private int model;
    public double price;
    protected int warrantyYears;
    
    
    public Vehicle(String name,int numberOfTyres,int model,double price,int warrantyYears){
        this.name=name;
        this.numberOfTyres=numberOfTyres;
        this.model=model;
        this.price=price;
        this.warrantyYears=warrantyYears;
    }

    public int getModel() {
        return model;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }




}
