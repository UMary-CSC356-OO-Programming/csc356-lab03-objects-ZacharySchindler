import java.util.Scanner;

class Employee {
    // Private member variables to store employee information
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;

    // Constructors to initialize Employee objects
    public Employee() {
        // Default constructor
    }

    public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }

    public Employee(String last, String first, int id, double wage) {
        this.lastName = last;
        this.firstName = first;
        this.employeeId = id;
        this.salary = wage;
    }

    // Setters and Getters for the employee attributes
    // These methods allow controlled access to the private member variables

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    public double getSalary() {
        return salary;
    }

    // Override toString() to provide a string representation of the Employee object
    @Override
    public String toString() {
        return String.format("%s, %s\nID Number: %d\nSalary : $%.2f", lastName, firstName, employeeId, salary);
    }

    // Custom method to check equality based on last name
    public boolean equals(String name) {
        return this.lastName.equals(name);
    }
}

