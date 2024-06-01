import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Find the largest two numbers
        Arrays.sort(numbers);
        int n = numbers.length;
        int largest1 = numbers[n - 1];
        int largest2 = numbers[n - 2];

        // Find the smallest two numbers
        int smallest1 = numbers[0];
        int smallest2 = numbers[1];

        // Print the results
        System.out.println("Largest two numbers: " + largest1 + " and " + largest2);
        System.out.println("Smallest two numbers: " + smallest1 + " and " + smallest2);
    }
}

