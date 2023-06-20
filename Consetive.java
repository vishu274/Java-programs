 /*Write a Java method that accepts three integers and checks whether they are consecutive or not. 
 Returns true or false.*/
 public class Consetive {
	
	    public static boolean areConsecutive(int num1, int num2, int num3) {
	        return (num2 == num1 + 1 && num3 == num2 + 1);
	    }

	    public static void main(String[] args) {
	        int num1 = 4;
	        int num2 = 5;
	        int num3 = 6;

	        boolean result = areConsecutive(num1, num2, num3);

	        System.out.println("The numbers " + num1 + ", " + num2 + ", " + num3 + " are consecutive: " + result);
	    }
	}