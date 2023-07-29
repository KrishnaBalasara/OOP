// Define the Car interface
interface Car {
    // Method signatures
    void start();
    void accelerate(double speed);
    void brake();
}

// Implementing class 1 - Sedan
class Sedan implements Car {
    private String brand;

    public Sedan(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Sedan manufactured by " + brand + " is starting.");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Sedan manufactured by " + brand + " is accelerating to " + speed + " km/h.");
    }

    @Override
    public void brake() {
        System.out.println("Sedan manufactured by " + brand + " is braking.");
    }
}

// Implementing class 2 - SUV
class SUV implements Car {
    private String brand;

    public SUV(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("SUV manufactured by " + brand + " is starting.");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("SUV manufactured by " + brand + " is accelerating to " + speed + " km/h.");
    }

    @Override
    public void brake() {
        System.out.println("SUV manufactured by " + brand + " is braking.");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan("Toyota");
        Car suv = new SUV("Honda");

        sedan.start();
        sedan.accelerate(60);
        sedan.brake();

        suv.start();
        suv.accelerate(80);
        suv.brake();
    }
}

/*  Sedan manufactured by Toyota is starting.
    Sedan manufactured by Toyota is accelerating to 60.0 km/h.
    Sedan manufactured by Toyota is braking.
    SUV manufactured by Honda is starting.
    SUV manufactured by Honda is accelerating to 80.0 km/h.
    SUV manufactured by Honda is braking. */
