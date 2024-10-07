package generalQuestion;

public class Sedan extends Vehicle{

    public Sedan(double CIF, int seatingCapacity, double grossWeight, int engineCapacity, int ageOfCar,String transportationMode,int daysInBond) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar,transportationMode,daysInBond);
    }

    public double calculateBondParkingFee(int daysInBond){
        return daysInBond*15000;
    }

    double checkChargeWeight(){
        double value=0.0;
        if (getGrossWeight() > 2000) {
            value = 0.15*getCIF();
        }

        else if(getGrossWeight() > 1500 && getGrossWeight() < 2000){
            value = 0.1*getCIF();
        }

        else if(getGrossWeight() < 1500){
            value = 0.02*getCIF();
        }

        return value;
    }


    double checkChargeEngineCapacity(){
        double value = 0;
        if (getEngineCapacity() > 2000) {
            value = getCIF()*0.1;
        }

        else if(getEngineCapacity() > 1500 && getEngineCapacity() < 2000){
            value = getCIF() * 0.05;
        }

        else if(getEngineCapacity() < 1500 ){
            value = getCIF() * 0.025;
        }
        return value;
    }

    double checkChargeAge(){
        double value = 0;
        if(getAgeOfCar() > 10 && getAgeOfCar() < 15){
            value = getCIF() * 0.1;
        }

        else if(getAgeOfCar() > 5 && getAgeOfCar() < 10){
            value = getCIF() * 0.05;
        }

        else if(getAgeOfCar() < 5){
            value = getCIF() * 0.015;
        }

        return value;
    }



    @Override
    double calculateTotalTaxes() {
        double total=0;
        total += calculateImportDuty()+calculateVAT()
        +calculateWHT()+infrastructureLevy+stampDuty+formFees+exciseDuty+checkChargeAge()+checkChargeEngineCapacity()+checkChargeWeight()+DPS+calculateAdditionalFees()+calculateBondParkingFee(getDaysInBond());
        return total;  
      }

    
    
}
