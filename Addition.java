//3. Addition of 3 variables of float type and store it in int and double type variable
import java.util.Scanner;
public class Addition {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first number:");
		float a = s.nextFloat();
		System.out.println("enter the second number:");
		float b = s.nextFloat();
		System.out.println("enter the third number:");
		float c = s.nextFloat();
		float sum = a+b+c;
		System.out.println("Sum (float): " + sum);
		int intSum = (int) sum;
		System.out.println("Sum (int): " + intSum);
		  double doubleSum = (double) sum;
		     System.out.println("Sum (double): " + doubleSum);
		  
}
	
	
}