import java.util.Scanner;

public class ArraySumandAverage {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the average of the elements in the array
        double average = (double) sum / size;

        // Print the sum and average of the array
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}
