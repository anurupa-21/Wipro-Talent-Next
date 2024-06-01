import java.util.Scanner;

public class ASCIIToChar {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store ASCII values
        int[] asciiArray = new int[size];

        // Prompt the user to enter the ASCII values
        System.out.println("Enter the ASCII values:");
        for (int i = 0; i < size; i++) {
            asciiArray[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Print the corresponding character values
        System.out.println("Corresponding character values:");
        for (int asciiValue : asciiArray) {
            char character = (char) asciiValue;
            System.out.print(character + " ");
        }
    }
}

