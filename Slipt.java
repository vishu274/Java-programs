//2. Split a float number into its integer and decimal part
Eg 94.64
integer 94, decimal value = .46

public class Slipt {
	 public static void main(String args []) {
		 float a = 94.64f;
		 System.out.println("the value of float =" + a);
		 int b = (int)a;
		 System.out.println(" the value of integer="+ b );
		  double c = a- b;
		 System.out.println(" the value of double="+ c);
		 
	 }
 }
