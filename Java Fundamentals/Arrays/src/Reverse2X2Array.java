public class Reverse2X2Array {
    
    static void reverseArray(int[][] arr) {
        // Swap elements symmetrically across the diagonal
        int temp = arr[0][0];
        arr[0][0] = arr[1][1];
        arr[1][1] = temp;

        temp = arr[0][1];
        arr[0][1] = arr[1][0];
        arr[1][0] = temp;
    }

    public static void main(String[] args) {
        // Check if 4 integers are provided as command line arguments
        if (args.length != 4) {
            System.out.println("please enter 4 integer number");
            return;
        }

        // Parse command line arguments to integers
        int[][] arr = new int[2][2];
        arr[0][0] = Integer.parseInt(args[0]);
        arr[0][1] = Integer.parseInt(args[1]);
        arr[1][0] = Integer.parseInt(args[2]);
        arr[1][1] = Integer.parseInt(args[3]);

        // Print the original array
        System.out.println("Original array:");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Print the reversed array
        System.out.println("Reversed array:");
        printArray(arr);
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
