import java.util.Scanner;

public class EmployeeApp {
    public static final int MAX_EMPLOYEES = 5;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee[] employees = new Employee[MAX_EMPLOYEES];
        Employee currentEmployee;
        String inputString;
        int inputInt;
        double inputDouble;
        char choice;
        int empCount = 0;

        // Initializing some employees
        employees[empCount++] = new Employee("Mitchum", "Robert", 120402, 34000.0);
        employees[empCount++] = new Employee("Ryan", "Cornelius");
        employees[empCount++] = new Employee("Asimov", "Isaac");

        // Main loop to interact with the user
        do {
            System.out.println("\n   Enter Selection\n   ===============");
            System.out.println("A> Add new Employee");
            System.out.println("E> Edit Employee");
            System.out.println("L> List Employees");
            System.out.println("Q> Quit");
            System.out.print("   Select: ");
            inputString = keyboard.nextLine();
            choice = inputString.toUpperCase().charAt(0);
            System.out.println();

            switch (choice) {
                case 'A':
                    if (empCount < MAX_EMPLOYEES - 1) {
                        employees[empCount] = new Employee();

                        // Collect employee information
                        System.out.print("Enter Last Name : ");
                        String lastName = keyboard.nextLine();
                        employees[empCount].setLastName(lastName);

                        System.out.print("Enter First Name : ");
                        String firstName = keyboard.nextLine();
                        employees[empCount].setFirstName(firstName);

                        System.out.print("Enter Employee ID : ");
                        inputInt = keyboard.nextInt();
                        employees[empCount].setEmployeeId(inputInt);

                        System.out.print("Enter Employee Salary: ");
                        inputDouble = keyboard.nextDouble();
                        employees[empCount].setSalary(inputDouble);

                        empCount++;
                    }
                    keyboard.nextLine(); 
                    break;

                case 'E':
                    // Edit employee information
                    System.out.print("Enter Last Name of Employee to Edit: ");
                    inputString = keyboard.nextLine();
                    for (int lp = 0; lp < MAX_EMPLOYEES; lp++) {
                        if (employees[lp] != null) {
                            if (employees[lp].equals(inputString)) {
                                System.out.print("Enter Employee ID    : ");
                                inputInt = keyboard.nextInt();
                                employees[lp].setEmployeeId(inputInt);

                                System.out.print("Enter Employee Salary: ");
                                inputDouble = keyboard.nextDouble();
                                employees[lp].setSalary(inputDouble);

                                keyboard.nextLine(); // Consume the newline character
                            }
                        }
                    }
                    break;

                case 'L':
                    // Display employee information
                    for (int lp = 0; lp < MAX_EMPLOYEES; lp++) {
                        if (employees[lp] != null) {
                            System.out.println(employees[lp]);
                        }
                    }
                    break;
            }
            keyboard.reset(); // Reset the Scanner
        } while (choice != 'Q'); // Continue the loop until the user chooses to quit
    }
}
