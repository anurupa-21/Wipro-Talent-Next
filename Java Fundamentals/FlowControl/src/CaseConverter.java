import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Close the scanner
        scanner.close();

        // Check if the character is in lowercase
        if (Character.isLowerCase(ch)) {
            // Convert to uppercase and display
            System.out.println("Uppercase: " + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            // Convert to lowercase and display
            System.out.println("Lowercase: " + Character.toLowerCase(ch));
        } else {
            // Display if the character is not an alphabet
            System.out.println("Not an alphabet.");
        }
    }
}
