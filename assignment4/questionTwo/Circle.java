package assignment4.questionTwo;
//number 2 question
public class Circle {
    private static Double PI;
    private double radius;


    static {
        PI=3.14;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public static Double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    double calculateArea(){
        return PI*this.radius*this.radius;
    }


    public static void main(String[] args) {
        Circle c1=new Circle(10);
        Circle c2= new Circle(5);

        System.out.println("---------------------Circle one-------------------------------------------");
        System.out.println("Circle one radius is : " + c1.radius+ " and " + "Circle one area is : " + c1.calculateArea());
        System.out.println("-----------------------Circle two---------------------------------------");
        System.out.println(" Circle two radius is : " + c2.radius + " and Circle two area is :" + c2.calculateArea() );

    }


}
