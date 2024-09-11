public class test {
    public static void main(String[] args){
        Student student1=new Student(100);
        student1.setFeesID(200);
        int feesID=student1.getFeesID();
        System.out.println("the name of student :" + " " +student1.studentName);
        System.out.println("registration number: " +"" + student1.getRegistrationNumber());
        System.out.println("fees id :" + "" + feesID);
    }
}
