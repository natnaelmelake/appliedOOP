package assignment5;

public class GeometricObject {
    private String color;

    public GeometricObject(String color){
        this.color=color;
    }


    public double getArea(){
        return 0.0;
    }

    public String getColor() {
        return color;
    }


    public void displayDetails() {
        System.out.println("This is a geometric object.");
    }

    public void displayDetails(String shapeName) {
        System.out.println("This is a " + shapeName + ".");
    }
}
