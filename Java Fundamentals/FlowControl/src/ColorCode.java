import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a color code
        System.out.print("Enter a color code (R, B, G, O, Y, W): ");
        char code = scanner.next().charAt(0);

        // Close the scanner
        scanner.close();

        // Convert the color code to uppercase
        code = Character.toUpperCase(code);

        // Determine the color name based on the color code
        String colorName;
        switch (code) {
            case 'R':
                colorName = "Red";
                break;
            case 'B':
                colorName = "Blue";
                break;
            case 'G':
                colorName = "Green";
                break;
            case 'O':
                colorName = "Orange";
                break;
            case 'Y':
                colorName = "Yellow";
                break;
            case 'W':
                colorName = "White";
                break;
            default:
                colorName = "Invalid code";
                break;
        }

        // Print the color name
        System.out.println("Color name: " + colorName);
    }
}

