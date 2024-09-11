public class Student {
    private  int registrationNumber;
    private int feesID;
    String studentName;


    public Student(int registrationNumber){
        this.registrationNumber=registrationNumber;
    }


    public int getFeesID() {
        return feesID;
    }

    public void setFeesID(int feesID) {
        this.feesID = feesID;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

}
