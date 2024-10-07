package generalQuestion;
import java.util.Scanner;
public class MainRunner {
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running = true;

        
        while (running) {
            System.out.println("--- Vehicle Import Tax Calculator ---");
            System.out.println("1. Ambulance");
            System.out.println("2. Esate");
            System.out.println("3. Sedan");
            System.out.println("4. SUV");
            System.out.println("5. Trailer");
            System.out.println("6. other type of car");
            System.out.println("7. Exit");
            System.out.print("Select a vehicle type: ");

            int choice = input.nextInt();


            switch (choice) {
                case 1:
                    Vehicle ambulance = createAmbulance();
                    System.out.println("total taxes for ambulance is : ");
                    System.out.println(ambulance.calculateTotalTaxes());
                    break;
                case 2:
                    Vehicle estate = createEstate();
                    System.out.println("total taxes for Estate is : ");
                    System.out.println(estate.calculateTotalTaxes());
                    break;
                case 3:
                    Vehicle sedan = createSedan();
                    System.out.println("total taxes for Sedan is : ");
                    System.out.println(sedan.calculateTotalTaxes());
                    break;
                case 4:
                    Vehicle suv = createSUV();
                    System.out.println("total taxes for SUV is : ");
                    System.out.println(suv.calculateTotalTaxes());
                    break;
                case 5:
                    Vehicle trailer = createTrailer();
                    System.out.println("total taxes for Trailer is : ");
                    System.out.println(trailer.calculateTotalTaxes());
                    break;
                case 6:
                    Vehicle other = createOther();
                    System.out.println("total taxes for other vehicle is : ");
                    System.out.println(other.calculateTotalTaxes());
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting");
                    System.exit(0);
                
                default:
                    System.out.println("Invalid input please select valid input.");
                    continue;
            }
        }
    }



    private static Vehicle createOther() {
        System.out.println("Enter CIF : ");
        double CIF = input.nextDouble();

        System.out.println("Enter Seating Capacity : ");
        int seatingCapacity = input.nextInt();

        System.out.println("Enter gross weight : ");
        double grossWeight = input.nextDouble();

        System.out.println("Enter engine capacity : ");
        int engineCapacity = input.nextInt();

        System.out.println("Enter age of car : ");
        int ageOfCar = input.nextInt();

        System.out.println("Enter mode of transportation carrier bed / driven : ");
        String transportationMode = input.next();

        System.out.println("select APS or DPS : ");
        String APS_or_DPS = input.next();

        System.out.println("Enter number of days spent in parking : ");
        int daysInBond = input.nextInt();
        return new OtherVehicles(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar, transportationMode, daysInBond, APS_or_DPS);
        }



    private static Vehicle createTrailer() {
        System.out.println("Enter CIF : ");
        double CIF = input.nextDouble();

        System.out.println("Enter Seating Capacity : ");
        int seatingCapacity = input.nextInt();

        System.out.println("Enter gross weight : ");
        double grossWeight = input.nextDouble();

        System.out.println("Enter engine capacity : ");
        int engineCapacity = input.nextInt();

        System.out.println("Enter age of car : ");
        int ageOfCar = input.nextInt();

        System.out.println("Enter mode of transportation carrierbed / driven : ");
        String transportationMode = input.next();

        System.out.println("select APS or DPS : ");
        String APS_or_DPS = input.next();

        System.out.println("Enter number of days spent in parking : ");
        int daysInBond = input.nextInt();
        
        return new Trailer(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar, transportationMode,APS_or_DPS,daysInBond) ;  
    }



    private static Vehicle createSUV() {
        System.out.println("Enter CIF : ");
        double CIF = input.nextDouble();

        System.out.println("Enter Seating Capacity : ");
        int seatingCapacity = input.nextInt();

        System.out.println("Enter gross weight : ");
        double grossWeight = input.nextDouble();

        System.out.println("Enter engine capacity : ");
        int engineCapacity = input.nextInt();

        System.out.println("Enter age of car : ");
        int ageOfCar = input.nextInt();

        System.out.println("Enter mode of transportation carrier bed / driven : ");
        String transportationMode = input.next();

        System.out.println("Enter number of days spent in parking : ");
        int daysInBond = input.nextInt();
        
        return new SUV(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar, transportationMode,daysInBond);  
   }



    private static Vehicle createSedan() {
        System.out.println("Enter CIF : ");
        double CIF = input.nextDouble();

        System.out.println("Enter Seating Capacity : ");
        int seatingCapacity = input.nextInt();

        System.out.println("Enter gross weight : ");
        double grossWeight = input.nextDouble();

        System.out.println("Enter engine capacity : ");
        int engineCapacity = input.nextInt();

        System.out.println("Enter age of car : ");
        int ageOfCar = input.nextInt();

        System.out.println("Enter mode of transportation carrier bed / driven : ");
        String transportationMode = input.next();

        System.out.println("Enter number of days spent in parking : ");
        int daysInBond = input.nextInt();
        
        return new Sedan(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar, transportationMode,daysInBond) ;  
    }



    private static Vehicle createEstate() {
        System.out.println("Enter CIF : ");
        double CIF = input.nextDouble();

        System.out.println("Enter Seating Capacity : ");
        int seatingCapacity = input.nextInt();

        System.out.println("Enter gross weight : ");
        double grossWeight = input.nextDouble();

        System.out.println("Enter engine capacity : ");
        int engineCapacity = input.nextInt();

        System.out.println("Enter age of car : ");
        int ageOfCar = input.nextInt();

        System.out.println("Enter mode of transportation carrier bed / driven : ");
        String transportationMode = input.next();

        System.out.println("select APS or DPS : ");
        String APS_or_DPS = input.next();

        System.out.println("Enter number of days spent in parking : ");
        int daysInBond = input.nextInt();
        
        return new Estate(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar, transportationMode,APS_or_DPS,daysInBond);  
      }


    private static Vehicle createAmbulance() {
        System.out.println("Enter CIF : ");
        double CIF = input.nextDouble();

        System.out.println("Enter Seating Capacity : ");
        int seatingCapacity = input.nextInt();

        System.out.println("Enter gross weight : ");
        double grossWeight = input.nextDouble();

        System.out.println("Enter engine capacity : ");
        int engineCapacity = input.nextInt();

        System.out.println("Enter age of car : ");
        int ageOfCar = input.nextInt();

        System.out.println("Enter mode of transportation carrier bed / driven : ");
        String transportationMode = input.next();

        System.out.println("Enter number of days spent in parking : ");
        int daysInBond = input.nextInt();
        
        return new Ambulance(CIF, seatingCapacity, grossWeight, engineCapacity, ageOfCar, transportationMode,daysInBond) ;  
    }




}
