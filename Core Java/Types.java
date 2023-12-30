// 1.2 Basic Datatypes, variable types, Modifier types, Final keyword, Constructors

// Define a class named "employee"
public class Types {
    // Instance variables (fields)
    String name;
    int age;
    final String gender; // Final variable

    // Static variable
    static int totemp = 0;

    // Constructor with parameters
    public Types(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        totemp++;
    }

    // Method to display information about the employee
    public void displayInfo() {
        System.out.println("employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    // Static method
    public static void displaytotemp() {
        System.out.println("Total employees: " + totemp);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects of the employee class
        Types employee1 = new Types("Sparsh", 21, "Male");
        Types employee2 = new Types("Shreya", 30, "Female");

        // Displaying information about each employee
        employee1.displayInfo();
        System.out.println("\t");
        employee2.displayInfo();
        System.out.println("\t");

        // Displaying total employees using the static method
        Types.displaytotemp();
    }
}
