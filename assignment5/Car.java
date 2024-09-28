    package assignment5;

    public class Car extends Vehicle{

        private double sellingPrice;

        public Car(String name, int numberOfTyres, int modelYear,double sellingPrice) {
            super(name, numberOfTyres, modelYear);
            this.sellingPrice=sellingPrice;
        }


        public void drive(){
            System.out.println("car is driving. VROOM VROOM");
        }


        @Override
        public void displayInfo() {
            System.out.println("displaying car info");
            super.displayInfo();
            System.out.println("selling price of the car is : " + this.sellingPrice);
        }

    }
