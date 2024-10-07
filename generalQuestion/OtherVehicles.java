package generalQuestion;

public class OtherVehicles extends Vehicle{
    private String APSorDPS;
    public OtherVehicles(double CIF, int seatingCapacity, double grossWeight, int engineCapacity, int ageOfCar,String transportationMode,int daysInBond,String APSorDPS) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar, transportationMode,daysInBond);
        this.APSorDPS=APSorDPS;
    }

    public double calculateBondParkingFee(int daysInBond){
        return daysInBond*15000;
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
        
        double total = calculateImportDuty()+calculateVAT()+calculateWHT()+
        calculateBondParkingFee(getDaysInBond())+infrastructureLevy+stampDuty+formFees+exciseDuty+checkAPS_or_DPS()+calculateBondParkingFee(getDaysInBond());
        return total;
 }
    
}
