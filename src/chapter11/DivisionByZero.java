package chapter11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        int numerator = input("Enter numerator");
        int denominator = input("Enter denominator ");
        try {
            int approximateQuotient = numerator / denominator;
            display(approximateQuotient+"");
        }
        catch(ArithmeticException px){
            display("you cant put zero");

        }
    }

    private static int input(String prompt){
        display(prompt);
        Scanner keyboardInput = new Scanner(System.in);
        try{
        return keyboardInput.nextInt();

    }
        catch(InputMismatchException p) {
            display("get lost");
            System.exit(3);
        }
        return 0;
        }
    private static void display(String prompt){
        System.out.println(prompt);
    }
}
