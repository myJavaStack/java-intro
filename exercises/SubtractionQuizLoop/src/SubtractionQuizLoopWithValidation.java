
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author IT
 */
public class SubtractionQuizLoopWithValidation {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions

        Scanner sc = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit integers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the student to answer “What is number1 – number2?”
            System.out.print(
                    "What is " + number1 + " - " + number2 + "? ");

            int answer;

            
            // Validation
            if (sc.hasNextInt()) {
                answer = sc.nextInt();
            } else {
                answer = -10;
            }
            sc.nextLine();

            while (answer < -1) {
                System.out.println("Invalid number. Enter again:");
                if (sc.hasNextInt()) {
                    answer = sc.nextInt();
                } else {
                    answer = -10;
                }
                sc.nextLine();
            }

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2));
            }

            // Increase the count
            count++;

        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount
                + "\nTest time is " + testTime / 1000 + " seconds\n");
    }
}


