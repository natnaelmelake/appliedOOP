package assignment5;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }


    public double getRadius() {
        return radius;
    }


    @Override
    public String getColor() {
        return super.getColor();
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
}
