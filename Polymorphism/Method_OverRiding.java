public class Car {
    public void displayInfo() {
        System.out.println("Generic Car Information:");
        System.out.println("Make: Generic");
        System.out.println("Model: Generic");
    }
}

// Mercedes Class (Subclass)
class Mercedes extends Car {
    @Override
    public void displayInfo() {
        System.out.println("Mercedes Information:");
        System.out.println("Make: Mercedes");
        System.out.println("Model: AMG GT");
    }
}

// Rolls Royce Class (Subclass)
class RollsRoyce extends Car {
    @Override
    public void displayInfo() {
        System.out.println("Rolls Royce Information:");
        System.out.println("Make: Rolls Royce");
        System.out.println("Model: Phantom");
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car genericCar = new Car();
        Car mercedes = new Mercedes();
        Car rollsRoyce = new RollsRoyce();

        genericCar.displayInfo();   // Output: Generic Car Information
        System.out.println();

        mercedes.displayInfo();     // Output: Mercedes Information
        System.out.println();

        rollsRoyce.displayInfo();   // Output: Rolls Royce Information
    }
}
