import java.util.Scanner;

public class CheckArray {
    
    static boolean checkArray(int[] arr) {
        for (int num : arr) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean result = checkArray(arr);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
