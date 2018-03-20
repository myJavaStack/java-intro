
import java.util.Scanner;

public class GCD {



    public static int gettingInput() {
        int number1;
       
        Scanner input = new Scanner(System.in);

        System.out.print("provide an integer number: \n");

        if (input.hasNextInt()) {
            number1 = input.nextInt();
        } else {
            number1 = -1;
        }
        input.nextLine();

        while (number1 < 1) {
            System.out.println("Invalid number. Enter again: ");
            if (input.hasNextInt()) {
                number1 = input.nextInt();
            } else {
                number1 = -1;
            }
            input.nextLine();
        }

        return number1;

    }

    /**
     * Find gcd for integers m and n
     */
    public static int gcd(int m, int n) {
        int gcd = 1;

        if (m % n == 0) {
            return n;
        }

        for (int k = n / 2; k >= 1; k--) {
            if (m % k == 0 && n % k == 0) {
                gcd = k;
                break;
            }
        }

        return gcd;
    }


  
    public static void main(String[] args) {
        int number1 = gettingInput();
        int number2 = gettingInput();
        int result;
        if (number1 >= number2) {
            result = gcd(number1, number2);
        } else {
            result = gcd(number2, number1);
        }
         System.out.println("The GCD of " + number1 + " and " + number2 + " is " + result);
    }
}
