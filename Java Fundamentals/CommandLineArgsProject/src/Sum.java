public class Sum {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Usage: java Sum <integer1> <integer2>");
            return;
        }

        try {
            // Parse the arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate the sum
            int sum = num1 + num2;

            // Print the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}
