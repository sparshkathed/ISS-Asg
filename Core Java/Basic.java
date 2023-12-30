// 1.1 Basics of Java: Concept of Class, Object, State (instance variable) and Methods (behavior).

// Define a simple class named "Employee"
class Employee {
    // Instance variables (state)
    String name;
    int ID;

    // Constructor method
    public Employee(String name, int id) {
        this.name = name;
        this.ID = id;
    }

    // Method to display information about the Employee
    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
    }
}

// Basic class to test the Employee class
public class Basic {
    public static void main(String[] args) {
        // Creating an object of the Employee class
        Employee info = new Employee("Sparsh", 21);

        // Displaying information
        info.displayInfo();
    }
}
