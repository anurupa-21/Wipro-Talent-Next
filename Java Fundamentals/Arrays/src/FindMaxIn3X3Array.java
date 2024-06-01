public class FindMaxIn3X3Array {
    
    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value
        
        // Iterate through all elements of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) { // Update max if current element is greater
                    max = arr[i][j];
                }
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        // Check if 9 integers are provided as command line arguments
        if (args.length != 9) {
            System.out.println("Usage: java FindMaxIn3x3Array <element1> <element2> ... <element9>");
            return;
        }

        // Parse command line arguments to integers and fill the array
        int[][] arr = new int[3][3];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
            }
        }

        // Print the given array
        System.out.println("Given array:");
        printArray(arr);

        // Find the maximum number in the array
        int max = findMax(arr);

        // Print the maximum number
        System.out.println("Maximum number in the array: " + max);
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
