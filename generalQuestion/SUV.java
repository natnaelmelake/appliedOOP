package generalQuestion;

public class SUV extends Vehicle{

    public SUV(double CIF, int seatingCapacity, double grossWeight, int engineCapacity, int ageOfCar,String transportationMode,int daysInBond) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar,transportationMode,daysInBond);
    }

    public double calculateBondParkingFee(int daysInBond){
        return daysInBond*15000;
    }

    double checkChargeSeatingCapacity(){
        return 250000*(getSeatingCapacity()-5);
    }

    double checkChargeWeight(){
        double value=0.0;
        if (getGrossWeight() > 5000) {
            value = 0.15*getCIF();
        }

        return value;
    }


    double checkChargeAge(){
        double value = 0;
        if(getAgeOfCar() > 1 && getAgeOfCar() < 5){
            value = getCIF() * 0.01;
        }

        else if(getAgeOfCar() > 5 && getAgeOfCar() < 10){
            value = getCIF() * 0.15;
        }

        else if(getAgeOfCar() > 10){
            value = getCIF() * 0.25;
        }

        return value;
    }


    @Override
    double calculateTotalTaxes() {
        double total=0;
        total += calculateImportDuty()+calculateVAT()
        +calculateWHT()+infrastructureLevy+stampDuty+formFees+exciseDuty+checkChargeAge()+ checkChargeWeight()+APS+calculateAdditionalFees()+calculateBondParkingFee(getDaysInBond());
        return total;  
    }
    
}
