import java.util.Scanner;

public class RearrangeEvenOdd {
    
    static void rearrangeArray(int[] arr) {
        int evenIndex = 0;
        
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If the current number is even, swap it with the number at evenIndex
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[evenIndex];
                arr[evenIndex] = temp;
                evenIndex++; // Move to the next position for even number
            }
        }
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

        rearrangeArray(arr);
        
        System.out.println("Array after rearranging even and odd numbers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
