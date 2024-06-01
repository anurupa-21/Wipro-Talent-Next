public class CommandLineArgCheck {
    public static void main(String[] args) {
        // Check if command line arguments are received
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Print all the values separated by commas
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
