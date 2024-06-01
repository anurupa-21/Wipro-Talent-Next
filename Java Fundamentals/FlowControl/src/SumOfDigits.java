import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the sum of digits
        int sum = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        // Print the sum of digits
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}

