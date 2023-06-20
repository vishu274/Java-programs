/*Write a Java program to create a vehicle class hierarchy. 
The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. 
Base should have properties such as make, model, year, and sub class should have fuel type.*/
import java.util.Scanner;
class Vehicle{
	String make;
	String model;
	String year;
	Scanner sc = new Scanner(System.in);
	public void make1() {
	System.out.println("enter the model");
	 make  = sc. next();
	 
	
}
	public void model1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the model");
		 model  = sc. next();
		 
		 
	}
	public void year1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		 year  = sc. next();
		
		
		
	}
}




class Truck extends Vehicle{
	String fuel;
	public void  getfuel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fuel");
		 fuel  = sc. next();
		
		
	}
	
	
}




class Car extends Vehicle{
	String fuel;
	public void getfuel1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fuel");
		 fuel  = sc. next();
		
		
	}
	
}

class Motocycle extends Vehicle{
	String fuel;
	public void getfuel2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fuel");
		 fuel  = sc. next();
		
	
}
}




public class Mainn {
	public static void main(String args[]) {
		Motocycle obj = new Motocycle();
		obj.getfuel2();
		System.out.println("Motorcycle:");
	
		Car obj1 = new Car();
		obj1. getfuel1(); 
		
		
		Truck obj2 = new Truck();
		obj2.getfuel();
		
		
		
	}
	
}


