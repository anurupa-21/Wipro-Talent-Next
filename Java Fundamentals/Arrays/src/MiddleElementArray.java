import java.util.Scanner;

public class MiddleElementArray {
    
    static int[] middleElement(int[] a, int[] b) {
        int[] result = { a[1], b[1] }; // Create a new array with middle elements of a and b
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter elements for array a
        System.out.println("Enter elements for array a:");
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        // Prompt the user to enter elements for array b
        System.out.println("Enter elements for array b:");
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        int[] result = middleElement(a, b);

        // Print the middle elements
        System.out.println("Middle elements: " + result[0] + " " + result[1]);

        scanner.close();
    }
}

