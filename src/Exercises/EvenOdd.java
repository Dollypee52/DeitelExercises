package Exercises;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = input.nextInt();

        if (number1 % 2 == 0)
        {
            System.out.println(number1 + "  is even");

        }else
        System.out.println(number1 + "  is odd");
    }
}