package generalQuestion;

public class Ambulance extends Vehicle{

    

    public Ambulance(double CIF, int seatingCapacity, double grossWeight, int engineCapacity, int ageOfCar,String transportationMode,int daysInBond) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar, transportationMode,daysInBond);
    }

    public double calculateBondParkingFee(int daysInBond){
        return daysInBond*15000;
    }


    @Override
    double calculateTotalTaxes() {
        double total=0; 
        if(getAgeOfCar() > 10){
            total+=getCIF()*0.15;
        }
        total+=calculateImportDuty()+calculateVAT()+calculateWHT()+infrastructureLevy+stampDuty+formFees+exciseDuty+calculateAdditionalFees()+calculateBondParkingFee(getDaysInBond());
        return total;
    }
}

