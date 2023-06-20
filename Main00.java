 /*Write a program with a method named getTotal that accepts two integers as an argument and return its sum. 
 Call this method from main( ) and print the results.*/
 public class Main001 {
    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        int sum = getTotal(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
