// 1.5 Inheritance, Overriding, Polymorphism, Abstraction, Encapsulation, Interfaces, Packages

// Package declaration
package vehicle;
 
// Abstract class representing a generic vehicle
abstract class Vehicle {
    // Instance variables (Encapsulation)
    private String brand;
    private String model;

    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract method (Abstraction)
    abstract void start();

    // Concrete method
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Interface representing a vehicle with a horn
interface HasHorn {
    void honk();
}

// Car class inheriting from Vehicle and implementing HasHorn interface
class Car extends Vehicle implements HasHorn {
    // Constructor
    public Car(String brand, String model) {
        super(brand, model);
    }

    // Overriding the start method
    @Override
    void start() {
        System.out.println("Car is starting...");
    }

    // Implementing the honk method from HasHorn interface
    @Override
    public void honk() {
        System.out.println("Honk! Honk!");
    }
}

// Motorcycle class inheriting from Vehicle
class Motorcycle extends Vehicle {
    // Constructor
    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    // Overriding the start method
    @Override
    void start() {
        System.out.println("Motorcycle is starting...");
    }
}

// Main class
public class oops {
    public static void main(String[] args) {
        // Creating objects
        Car myCar = new Car("Toyota", "Camry");
        Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR");

        // Polymorphism: Using the same method on different objects
        startVehicle(myCar);
        startVehicle(myMotorcycle);

        // Abstraction: Using the abstract class to declare a reference
        Vehicle anotherCar = new Car("Ford", "Mustang");
        startVehicle(anotherCar);

        // Encapsulation: Accessing information through methods
        myCar.displayInfo();
        myMotorcycle.displayInfo();

        // Interfaces: Using the HasHorn interface
        myCar.honk();

        // Packages: Using classes from the 'vehicle' package
        // Note: This class (Main) should be in a different file in the 'vehicle' package.
    }

    // Polymorphism: Using the same method on different types of vehicles
    private static void startVehicle(Vehicle vehicle) {
        vehicle.start();
    }
}

