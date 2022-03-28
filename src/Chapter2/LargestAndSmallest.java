package Chapter2;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int number2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = input.nextInt();
        System.out.println("Enter the fourth number: ");
        int number4 = input.nextInt();
        System.out.println("Enter the fifth number: ");
        int number5 = input.nextInt();

        int largest = number5;
        System.out.println("The largest is: " +largest);
        int smallest = number1;
        System.out.println("The smallest is: " +smallest);




    }
}
