import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;

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

    // Setters and Getters
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

    @Override
    public String toString() {
        return String.format("%s, %s\nID Number: %d\nSalary : $%.2f", lastName, firstName, employeeId, salary);
    }

    public boolean equals(String name) {
        return this.lastName.equals(name);
    }
}

