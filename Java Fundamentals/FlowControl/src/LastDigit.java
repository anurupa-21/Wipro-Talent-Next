import java.util.Scanner;

public class LastDigit{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first non-negative integer
        System.out.print("Enter the first non-negative integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second non-negative integer
        System.out.print("Enter the second non-negative integer: ");
        int num2 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the last digits are the same
        boolean sameLastDigit = (num1 % 10) == (num2 % 10);

        // Print the result
        System.out.println(sameLastDigit);
    }
}
