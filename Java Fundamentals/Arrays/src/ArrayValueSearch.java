import java.util.Scanner;

public class ArrayValueSearch {
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

        // Prompt the user to enter the value to search
        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the value is present in the array and print the index
        boolean found = false;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchValue) {
                found = true;
                index = i;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("Value " + searchValue + " found at index " + index);
        } else {
            System.out.println("Value " + searchValue + " not found in the array. -1 is printed");
        }
    }
}

