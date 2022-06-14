package Exercises;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Enter numbers: ");
            int numbers = input.nextInt();
            sum = sum + numbers;

        }
        System.out.println("The addition of the numbers is: "+sum);
    }


}
