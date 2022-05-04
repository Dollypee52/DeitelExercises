package Exercises;

import java.util.Scanner;

public class pay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score ");
        int score = input.nextInt();

        if (score > 90) {
            System.out.print("Increase pay by 3%");
        }
        else
            System.out.print("Increase pay by 1%");
    }
}
