import java.util.Scanner;
public class FloydTriangleWhile {
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
            int i = 1;
            int number = 1;
            while (i <= rows) {
                int j = 1;
                while (j <= i) {
                    System.out.print("* ");
                    number++;
                    j++;
                }
                System.out.println();
                i++;
            }
        } else {
            // If user input is not an integer
            System.out.println("Please enter an integer number.");
        }
    }
}
