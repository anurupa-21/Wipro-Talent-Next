public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");
        
        // Loop through numbers from 10 to 99
        for (int i = 10; i <= 99; i++) {
            // Check if the current number is prime
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // Print the prime number if found
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
