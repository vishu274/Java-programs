/* Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
 Create a subclass called Employee that adds a new method named getEmployeeId().*/

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class Employee extends Person {
    private int employeeId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}

public class first{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        
        System.out.print("Enter first name: ");
        employee.setFirstName(scanner.nextLine());

        System.out.print("Enter last name: ");
        employee.setLastName(scanner.nextLine());

        System.out.print("Enter employee ID: ");
        employee.setEmployeeId(scanner.nextInt());

        scanner.close();

        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
