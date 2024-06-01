public class CheckNumber {
    public static void main(String[] args) {
        // Check if exactly one argument is passed
        if (args.length != 1) {
            System.out.println("Usage: java CheckNumber <integer>");
            return;
        }

        try {
            // Parse the argument as an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number " + number + " is positive.");
            } else if (number < 0) {
                System.out.println("The number " + number + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}