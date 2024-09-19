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
