import java.util.Scanner;

public class FlyodTriangleFor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number of rows: ");
        

        // Check if user input is an integer
        if (scanner.hasNextInt()) {
            int rows = scanner.nextInt();

            // Close the scanner
            scanner.close();

            // Print Floyd's triangle pattern
            int number = 1;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                    number++;
                }
                System.out.println();
            }
        } else {
            // If user input is not an integer
            System.out.println("Please enter an integer number.");
        }
    }
}
