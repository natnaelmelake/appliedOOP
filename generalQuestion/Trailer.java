package generalQuestion;

public class Trailer extends Vehicle{
    private String APSorDPS;
    public Trailer(double CIF, int seatingCapacity, double grossWeight, int engineCapacity, int ageOfCar,String transportationMode,String APSorDPS,int daysInBond) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar,transportationMode,daysInBond);
        this.APSorDPS=APSorDPS;
    }

    public double calculateBondParkingFee(int daysInBond){
        return daysInBond*15000;
    }

    double checkChargeWeight(){
        double value=0.0;
        if (getGrossWeight() > 20000) {
            value = 0.25*getCIF();
        }

        else if(getGrossWeight() > 15000 && getGrossWeight() < 20000){
            value = 0.15*getCIF();
        }

        else if(getGrossWeight() < 15000){
            value = 0.05*getCIF();
        }

        return value;
    }


    double checkChargeEngineCapacity(){
        double value = 0;
        if (getEngineCapacity() > 20000) {
            value = getCIF()*0.1;
        }

        else if(getEngineCapacity() > 15000 && getEngineCapacity() < 20000){
            value = getCIF() * 0.05;
        }

        else if(getEngineCapacity() < 15000 ){
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

        else if(getAgeOfCar() > 10){
            value = getCIF() * 0.015;
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
        +calculateWHT()+infrastructureLevy+stampDuty+formFees+exciseDuty+checkChargeAge()+ checkChargeWeight()+checkChargeEngineCapacity()+calculateAdditionalFees()+checkAPS_or_DPS()+calculateBondParkingFee(getDaysInBond());
        return total;
    }
    
}
