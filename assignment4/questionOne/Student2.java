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
