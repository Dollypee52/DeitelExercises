package HackerrankExercises;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();


        if (n % 2 == 1) {
            System.out.println("weird");
        } else if (n % 2 == 0 && 2<=n && n <= 5) {
            System.out.println("Not weird");
        } else if (n % 2 == 0 && 6<= n && n <= 20) {
            System.out.println("weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not weird");
        } else {
            System.out.println("Out of bound");

        }
    }
}
