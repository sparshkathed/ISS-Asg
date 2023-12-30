// 1.7 Collection: List, Set and Map. Collection operations on primitives and custom object 
// and sorting List of primitives and custom object created above.

import java.util.*;

class employee implements Comparable<employee> {
    private int id;
    private String name;

    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        employee employee = (employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(employee otheremployee) {
        // Compare employees based on their IDs
        return Integer.compare(this.id, otheremployee.id);
    }
}

public class Collection {

    public static void main(String[] args) {
        // List Example with primitives
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(1);
        integerList.add(2);

        // List Example with custom objects (employee)
        List<employee> employeeList = new ArrayList<>();
        employeeList.add(new employee(3, "Bob"));
        employeeList.add(new employee(1, "John"));
        employeeList.add(new employee(2, "Alice"));

        // Sorting lists
        Collections.sort(integerList);
        Collections.sort(employeeList);

        // Displaying the sorted contents of collections
        System.out.println("Sorted List of Integers: " + integerList);
        System.out.println("Sorted List of employees (by ID): " + employeeList);

        // Sorting List of employees using Comparator (by Name)
        employeeList.sort(Comparator.comparing(employee::getName));

        // Displaying the sorted contents of collections
        System.out.println("Sorted List of employees (by Name): " + employeeList);

        // Set Example with primitives
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(1.1);
        doubleSet.add(2.2);
        doubleSet.add(3.3);
        System.out.println("\nSet of Doubles: " + doubleSet);

        // Set Example with custom objects (employee)
        Set<employee> employeeSet = new HashSet<>();
        employeeSet.add(new employee(1, "John"));
        employeeSet.add(new employee(2, "Alice"));
        employeeSet.add(new employee(3, "Bob"));
        System.out.println("Set of employees: " + employeeSet);

        // Map Example with primitives
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("One", 1);
        stringIntegerMap.put("Two", 2);
        stringIntegerMap.put("Three", 3);
        System.out.println("\nMap of String and Integer: " + stringIntegerMap);

        // Map Example with custom objects (employee as key and value)
        Map<employee, employee> employeeMap = new HashMap<>();
        employeeMap.put(new employee(1, "John"), new employee(101, "Math"));
        employeeMap.put(new employee(2, "Alice"), new employee(102, "History"));
        employeeMap.put(new employee(3, "Bob"), new employee(103, "Science"));
        System.out.println("Map of employees: " + employeeMap);
    }
}