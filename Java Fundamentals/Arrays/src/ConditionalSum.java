import java.util.Scanner;

public class ConditionalSum {
    
    static void conditionalSum(int[] l, int a, int b) {

        int sum = 0;
        boolean add = true;
        
        for (int i = 0; i < l.length; i++) {

            if (l[i] != a && add)
                sum += l[i];
            else if (l[i] == a)
                add = false;
            else if (l[i] == b)
                add = true;

        }

        System.out.println("Sum of elements with condition: " + sum);
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

        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of 'b': ");
        int b = scanner.nextInt();

        conditionalSum(arr, a, b);

        scanner.close();
    }
}

