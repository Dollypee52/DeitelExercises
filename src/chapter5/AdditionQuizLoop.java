package chapter5;

import java.util.Scanner;

public class AdditionQuizLoop {
//(Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
//5.3
//subtraction questions. Revise the program to generate ten random addition ques-
//tions for two integers between 1 and 15 . Display the correct count and test time.

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 1;
        int count = 1;
        long startTime = System.currentTimeMillis();
        String result = " ";
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
            } else
                System.out.println("Your answer is wrong.\n " + number1 + " + " + number2 + " should be "
                        + (number1 + number2));

            result += "\n " + number1 + "+" + number2 + "=" + answer + ((number1 + number2 == answer) ? "correct" : "wrong");


        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n " + result);
    }
}
