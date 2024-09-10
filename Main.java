public class Main {
    public static void main(String[] args) {
        Dog dog2 = new Dog("Max", 5);

        dog2.displayDogDetails(); 
        System.out.println("Total Dogs: " + Dog.getTotalDogs());
    }
}