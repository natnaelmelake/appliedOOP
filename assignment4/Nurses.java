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
