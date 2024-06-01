import java.util.Scanner;

public class RemoveTEns {
    
    static void removeTens(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 10) {
                arr[index++] = num;
            }
        }
        
        while (index < arr.length) {
            arr[index++] = 0;
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

        removeTens(arr);
        
        System.out.println("Array after removing 10s and shifting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

