package Chapter4;

import java.util.Scanner;

public class comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();

        if(firstNumber == secondNumber)
            System.out.println(0);
        else if(firstNumber > secondNumber)
            System.out.println(1);
        else
            System.out.println(-1);

    }
}
