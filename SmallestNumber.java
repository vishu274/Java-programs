import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Input the second number: ");
        double b = scanner.nextDouble();

        System.out.print("Input the third number: ");
        double c = scanner.nextDouble();

        double smallest = Math.min(a, Math.min(b, c);

        System.out.println("The smallest value is " + smallest);

       
    }
}
