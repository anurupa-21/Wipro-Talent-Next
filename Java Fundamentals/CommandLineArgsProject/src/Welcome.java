public class Welcome {
    public static void main(String[] args) {
        // Check if exactly one argument is passed
        if (args.length != 1) {
            System.out.println("Usage: java Welcome <name>");
            return;
        }

        // Extract the argument
        String name = args[0];

        // Print the welcome message
        System.out.println("Welcome " + name);
    }
}
