abstract class Vehicle {
   
    abstract void start();

    void fuelType() {
        System.out.println("Most vehicles use petrol or diesel.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key ignition.");
    }
}

public class abstracts {
    public static void main(String[] args) {
        Vehicle v = new Car(); 
        v.start();
        v.fuelType();
    }
}