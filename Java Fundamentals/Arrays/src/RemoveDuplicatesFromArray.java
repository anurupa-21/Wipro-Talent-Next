import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbersWithDuplicates = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbersWithDuplicates[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Sort the array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        // Count the number of unique elements
        int uniqueCount = 1;
        for (int i = 1; i < size; i++) {
            if (numbersWithDuplicates[i] != numbersWithDuplicates[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array to store unique elements
        int[] numbersWithoutDuplicates = new int[uniqueCount];

        // Copy unique elements to the new array
        numbersWithoutDuplicates[0] = numbersWithDuplicates[0];
        int index = 1;
        for (int i = 1; i < size; i++) {
            if (numbersWithDuplicates[i] != numbersWithDuplicates[i - 1]) {
                numbersWithoutDuplicates[index++] = numbersWithDuplicates[i];
            }
        }

        // Print the array without duplicates
        System.out.println("Array without duplicates:");
        System.out.println(Arrays.toString(numbersWithoutDuplicates));
    }
}

