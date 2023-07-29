public class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }

    // Method Overloading: Adding a new version of displayInfo() to support additional parameters
    public void displayInfo(String color) {
        System.out.println("Car Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }

    // Method Overloading: Adding another version of displayInfo() to support additional parameters
    public void displayInfo(int year) {
        System.out.println("Car Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic");

        car1.displayInfo();           // Output: Make: Toyota, Model: Corolla
        car1.displayInfo("Red");      // Output: Make: Toyota, Model: Corolla, Color: Red
        car1.displayInfo(2022);       // Output: Make: Toyota, Model: Corolla, Year: 2022
        System.out.println();

        car2.displayInfo();           // Output: Make: Honda, Model: Civic
        car2.displayInfo("Blue");     // Output: Make: Honda, Model: Civic, Color: Blue
        car2.displayInfo(2023);       // Output: Make: Honda, Model: Civic, Year: 2023
    }
}

