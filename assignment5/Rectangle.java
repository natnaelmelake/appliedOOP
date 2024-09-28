package assignment5;

public class Rectangle extends GeometricObject{
    private double length;
    private double width;

    public Rectangle(String color,double length,double width){
        super(color);
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
