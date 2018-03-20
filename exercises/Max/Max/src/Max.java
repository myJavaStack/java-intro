
import java.util.Scanner;

public class Max {

    
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

    public static int max(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3) {
            return n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return n2;
        } else if (n3 >= n1 && n3 >= n2) {
            return n3;
        }
        return -1;
    }

    public static void main(String[] args) {
        int number1 = gettingInput();
        int number2 = gettingInput();
        int number3 = gettingInput();
        int result = max(number1, number2, number3);

        System.out.println("The maximum of " + number1 + " and " + number2 + " and " + number3 + " is " + result);

    }
}
