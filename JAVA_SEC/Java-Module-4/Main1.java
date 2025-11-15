class Employee {
    String name;
    double salary;

    // Constructor for Employee
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    // Constructor for Manager
    Manager(String name, double salary, String department) {
        super(name, salary); // calling parent constructor
        this.department = department;
    }

    // Method to display manager details
    void displayManagerInfo() {
        displayInfo(); // call parent method
        System.out.println("Department: " + department);
    }
}

public class Main1 {
    public static void main(String[] args) {

        // Creating a Manager object
        Manager m = new Manager("Akshaya", 85000, "AI & ML");

        // Display all details
        m.displayManagerInfo();
    }
}
