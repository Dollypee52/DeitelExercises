package Chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer number1; ");
        int number1 = input.nextInt();

        System.out.print("Enter integer number2: ");
        int number2 = input.nextInt();

        int squarenumber1 = number1 * number1;
        System.out.println("The first number is " +number1);

        int squarenumber2 = number2 * number2;
        System.out.println("The second number is " +number2);

        int sum1 = squarenumber1 + squarenumber2;
        System.out.println("The sum of their squares is: " +sum1);

        int difference1 = squarenumber1 - squarenumber2;
        System.out.println("The difference of their squares is: " +difference1);


    }
}
