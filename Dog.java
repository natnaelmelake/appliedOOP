class Dog {
    static int totalDogs = 0;

    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
        totalDogs++; 
    }

    static int getTotalDogs() {
        return totalDogs;
    }

    void displayDogDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

