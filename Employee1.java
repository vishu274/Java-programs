 /*Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
 Create a subclass called Employee that adds a new method named getEmployeeId().*/
 import java.util.Scanner;

class Persons{
	String firstname;
	String lastname;
	public void getfirstname() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the name");
		firstname = sc.next();
	}
	public void getlastname() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the lastname");
		lastname = sc.next();
	}
}

 class Employee1 extends Persons {
	int id;
	public void getId() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the ID");
		id = sc.nextInt();
	}

	public static void main(String args[]) {
		Employee1 sc = new Employee1();
		sc.getfirstname();
		sc.getlastname();
		sc.getId();
		
		
		
	}

}


