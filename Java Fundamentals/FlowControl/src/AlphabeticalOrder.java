import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first character
        System.out.print("Enter the first character: ");
        char char1 = scanner.next().charAt(0);

        // Prompt the user to enter the second character
        System.out.print("Enter the second character: ");
        char char2 = scanner.next().charAt(0);

        // Close the scanner
        scanner.close();

        // Display the characters in alphabetical order
        if (char1 < char2) {
            System.out.println(char1 + ", " + char2);
        } else {
            System.out.println(char2 + ", " + char1);
        }
    }
}
