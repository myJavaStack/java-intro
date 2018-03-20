
import java.util.Scanner;

public class PrimeNumbers {

    // class variables go here
    // should always be private
    private int number;

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {
            // Print the prime number and increase the count
            if (isPrime(number)) {
                count++; // Increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    System.out.printf("%-5s\n", number);
                } else {
                    System.out.printf("%-5s", number);
                }
            }

            // Check if the next number is prime
            number++;
        }
    }

    /**
     * Check whether number is prime
     */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }

        return true; // number is prime
    }

    public void gettingInput() {
        // Create a Scanner  
        Scanner input = new Scanner(System.in);

        System.out.print("provide the number of prime number you want: \n");

        if (input.hasNextInt()) {
            number = input.nextInt();
        } else {
            number = -1;
        }
        input.nextLine();

        while (number < 1) {
            System.out.println("Invalid number. Enter again: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
            } else {
                number = -1;
            }
            input.nextLine();
        }

    }

    /**
     * Here is out work area for now
     */
    public void perform() {

        gettingInput();

        System.out.println("The first " + number + " prime numbers are \n");
        printPrimeNumbers(number);

    }

    /**
     * The main method is where a program starts. While you can write any code
     * that you want in the main method you should not. This method just gets
     * the ball rolling and waits for the program to end.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Instantiate the first or primary object
        PrimeNumbers pn = new PrimeNumbers();
        // Call the method that runs the show
        pn.perform();
        // End the program
        System.exit(0);
    }
}
