package Chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;

          System.out.print("Enter integer number1: ");
          int number1 = input.nextInt();

          int squareNumber1 = number1 * number1;
          System.out.println("The number is:" +squareNumber1);

          if (number1 > 100 && squareNumber1 > 100)
              System.out.println("The number1 and squareNumber1 is : " +100);

          if (number1 == 100 && squareNumber1 == 100)
              System.out.println("The number1 and squareNumber1 is equal to: " +100);

        if (number1 != 100 && squareNumber1 != 100)
            System.out.println("The number1 and squareNumber1 is not equal to: " +100);



    }
}
