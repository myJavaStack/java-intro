
import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {

        int number1;
        int number2;

        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");

        int answer = input.nextInt();

        System.out.println(
                number1 + " + " + number2 + " = " + answer + " is "
                + (number1 + number2 == answer));
    }
}
