//1. Input variables of following datatypes with Scanner
Integer
Float
Double
Char

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Integer
        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();
        System.out.println("You entered: " + a);

        // Input for Float
        System.out.print("Enter a float: ");
        float b= scanner.nextFloat();
        System.out.println("You entered: " + b);

        // Input for Double
        System.out.print("Enter a double: ");
        double c = scanner.nextDouble();
        System.out.println("You entered: " + c);

        // Input for Char
        System.out.print("Enter a character: ");
        char d = scanner.next().charAt(0);
        System.out.println("You entered: " + d);

        
    }
}
