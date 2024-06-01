public class CommandLineArgs1 {
    public static void main(String[] args) {
        // Check if the correct number of arguments are passed
        if (args.length != 2) {
            System.out.println("Usage: java CommandLineArgs <first_string> <second_string>");
            return;
        }

        // Extract the arguments
        String firstString = args[0];
        String secondString = args[1];

        // Print the desired output
        System.out.println(firstString + " Technologies " + secondString);
    }
}

