package generalQuestion;

public class Estate extends Vehicle{

    private String APSorDPS;
    public Estate(double CIF, int seatingCapacity, double grossWeight, int engineCapacity, int ageOfCar,String transportationMode,String APSorDPS,int daysInBond) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar,transportationMode,daysInBond);
        this.APSorDPS=APSorDPS;
    }

    double checkChargeSeatingCapacity(){
        return 250000*(getSeatingCapacity()-5);
    }

    double checkChargeWeight(){
        double value=0.0;
        if (getGrossWeight() > 2000) {
            value = 0.1*getCIF();
        }

        else if(getGrossWeight() > 1500 && getGrossWeight() < 2000){
            value = 0.05*getCIF();
        }

        else if(getGrossWeight() < 1500){
            value = 0.02*getCIF();
        }

        return value;
    }

    public double calculateBondParkingFee(int daysInBond){
        return daysInBond*15000;
    }


    double checkChargeEngineCapacity(){
        double value = 0;
        if (getEngineCapacity() > 1800) {
            value = getCIF()*0.05;
        }

        else if(getEngineCapacity() < 1800){
            value = getCIF() * 0.025;
        }
        return value;
    }

    double checkChargeAge(){
        double value = 0;
        if(getAgeOfCar() > 1 && getAgeOfCar() < 5){
            value = getCIF() * 0.01;
        }

        else if(getAgeOfCar() > 5 && getAgeOfCar() < 10){
            value = getCIF() * 0.05;
        }

        else if(getAgeOfCar() > 10){
            value = getCIF() * 0.15;
        }

        return value;
    }

    double checkAPS_or_DPS(){
        double value = 0;
        if (APSorDPS.toUpperCase().equals("APS")) {
            value = getAPS();
        }
        else if (APSorDPS.toUpperCase().equals("DPS")) {
            value = getDPS();
        }
        return value;
    }


    @Override
    double calculateTotalTaxes() {
        double total=0;
        total += calculateImportDuty()+calculateVAT()
        +calculateWHT()+infrastructureLevy+stampDuty+formFees+exciseDuty+checkChargeAge()+
        checkChargeEngineCapacity()+checkChargeSeatingCapacity()+checkChargeWeight()+calculateAdditionalFees()+checkAPS_or_DPS()+calculateBondParkingFee(getDaysInBond());
        return total; 
       }
    
}
