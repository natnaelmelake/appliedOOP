                            Answers to assignment:
question one:

package assignment4.questionOne;
//number one question
public class Student2 {
    String studentName;
    int studentID;
    static int increment=0;



    {
        studentID=++increment;
    }


    public Student2(String studentName){
        this.studentName=studentName;
    }


    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }


    public static void main(String[] args) {
        Student2 std1= new Student2("Natnael");
        Student2 std2= new Student2("Nathan");

        System.out.println("---------------------student one-------------------------------------------");
        System.out.println("student name is : " + std1.studentName+ " " + "Student ID is : " + std1.studentID);
        System.out.println("-----------------------student two---------------------------------------");
        System.out.println(" student name is : " + std2.studentName + " student ID is :" + std2.studentID );

    }
}


question 2:


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

question 3 demo :

package assignment4;
import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private ArrayList<Nurses> listOfNurses;

    public Hospital(String hospitalName){
        this.listOfNurses=new ArrayList<>();
        this.hospitalName=hospitalName;
    }


    public String getHospitalName() {
        return hospitalName;
    }

    public void addNurse(Nurses nurse){
        this.listOfNurses.add(nurse);
    }


    public void displayNurseDetaills(){
        for (Nurses nurse : listOfNurses) {
            System.out.println("nurse name is : " + nurse.getNurseName());
            System.out.println("nurse ID : " + nurse.getNurseID());
        }
    }    
}



package assignment4;

public class Nurses {
    private String nurseName;
    private int nurseID;


    public Nurses(String nurseName,int nurseID){
        this.nurseName=nurseName;
        this.nurseID=nurseID;
    }


    public int getNurseID() {
        return nurseID;
    }

    public String getNurseName() {
        return nurseName;
    }
 
}

package assignment4;

public class HospitalMain {

    public static void main(String[] args) {
        Hospital Kibuli = new Hospital("Kibuli"); 
        Nurses nurse1 = new Nurses("Fatima", 1);
        Nurses nurse2 = new Nurses("hajat", 2);

        Kibuli.addNurse(nurse1);
        Kibuli.addNurse(nurse2);

        Kibuli.displayNurseDetaills();
        

    }
    
}


question 4: access modifier demo

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








