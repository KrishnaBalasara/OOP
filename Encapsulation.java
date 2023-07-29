// Employee class with encapsulation
public class Employee {
    // Private instance variables
    private int employeeId;
    private String name;
    private double salary;

    // Public constructor
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Public getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Protected setter method for salary with validation
    protected void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary must be greater than 0.");
        }
    }

    // Default (package-private) method to update the name
    void updateName(String newName) {
        this.name = newName;
    }

    // Private method to calculate bonus (not directly accessible)
    private double calculateBonus() {
        // Some complex logic to calculate bonus based on salary and performance.
        return salary * 0.1;
    }

    // Public method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }
}
