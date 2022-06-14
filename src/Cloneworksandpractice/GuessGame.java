package Cloneworksandpractice;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myNumber = 6;
        System.out.println("Enter your value: ");
        int num = input.nextInt();
        if (num > myNumber) {
            System.out.println("guess number is too high, try again!!");
        } else if (num < myNumber) {
            System.out.println("guess number is too low, try again!!!");

        } else {
            System.out.println("guess number is correct, move to next stage");
        }
    }
}
