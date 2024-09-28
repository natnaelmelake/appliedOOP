package assignment5;

public class test2 {

    public static void showArea(GeometricObject obj) {
        System.out.println("The area is: " + obj.getArea());
    }
    public static void main(String[] args) {
        GeometricObject circlObject= new Circle("RED", 10);
        GeometricObject rectangleObject= new Rectangle("RED", 10,10);


        System.out.println("--------demo method overriding---------------");
        System.out.println("circle area : " + circlObject.getArea());
        System.out.println("rectangle area " + rectangleObject.getArea());



        System.out.println("----------------demo method oerloading--------------- ");
        circlObject.displayDetails();
        circlObject.displayDetails("Circle");


        System.out.println("---------------demo runtime polymorphism--------------");
        showArea(rectangleObject);
        showArea(circlObject);
        
    }
}
