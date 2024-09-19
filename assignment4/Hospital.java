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