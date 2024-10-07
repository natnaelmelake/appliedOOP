package generalQuestion;

public abstract class Vehicle {

    final double stampDuty=35000;
    final double formFees=20000;
    final double exciseDuty=200000;
    final double infrastructureLevy=150000;
    final double APS=300000;
    final double DPS=700000;
    final double parkingFee=15000;
    
    private double CIF;
    private int seatingCapacity;
    private double grossWeight;
    private int engineCapacity;
    private int ageOfCar;
    private String transportationMode;
    private int daysInBond;
    
    


    public Vehicle(double CIF, int seatingCapacity, double grossWeight, int engineCapacity, int ageOfCar,String transportationMode,int daysInBond) {
        this.CIF = CIF;
        this.seatingCapacity = seatingCapacity;
        this.grossWeight = grossWeight;
        this.engineCapacity = engineCapacity;
        this.ageOfCar = ageOfCar;
        this.transportationMode=transportationMode;
    }

    public double calculateAdditionalFees() {
        if ("carrier bed".equalsIgnoreCase(transportationMode)) {
            return 0.005 * CIF; 
        } else if ("driven".equalsIgnoreCase(transportationMode)) {
            return 0.015 * CIF; 
        }
        return 0;  
    }


    public double calculateBondParkingFee(int daysInBond){
        return daysInBond*15000;
    }


    double calculateImportDuty() {
       return 0.25*getCIF();
    }

    
    double calculateVAT() {
        return 0.18*getCIF();
        }

    double calculateWHT() {
        return 0.06*getCIF();
    }
    abstract double calculateTotalTaxes();


    public double getCIF() {
        return CIF;
    }

    public int getAgeOfCar(){
        return ageOfCar;
    }

    public double getStampDuty() {
        return stampDuty;
    }

    public double getFormFees() {
        return formFees;
    }

    public double getExciseDuty() {
        return exciseDuty;
    }

    public double getInfrastructureLevy() {
        return infrastructureLevy;
    }

    public double getAPS() {
        return APS;
    }

    public double getDPS() {
        return DPS;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getDaysInBond(){
        return daysInBond;
    }

    

    




}
