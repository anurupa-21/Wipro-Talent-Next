public class InterestCalculator {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Usage: java InterestCalculator <gender> <age>");
            return;
        }

        // Extract the gender and age from command line arguments
        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        // Calculate the percentage of interest based on gender and age
        double interestPercentage = 0.0;

        if (gender.equalsIgnoreCase("female")) {
            if (age >= 1 && age <= 58) {
                interestPercentage = 8.2;
            } else if (age >= 59 && age <= 100) {
                interestPercentage = 9.2;
            }
        } else if (gender.equalsIgnoreCase("male")) {
            if (age >= 1 && age <= 58) {
                interestPercentage = 8.4;
            } else if (age >= 59 && age <= 100) {
                interestPercentage = 10.5;
            }
        }

        // Print the result
        if (interestPercentage == 0.0) {
            System.out.println("Invalid gender or age range.");
        } else {
            System.out.println("Percentage of interest: " + interestPercentage + "%");
        }
    }
}
