import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number at position " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum of even numbers is: " + evenSum);
        System.out.println("Sum of odd numbers is: " + oddSum);

        
    }
}
