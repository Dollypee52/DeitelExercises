package Exercises;
import java.util.Scanner;

public class DivisbleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
     System.out.print("Enter the integer: ");
     int number1 = input.nextInt();

     if (number1 % 3 == 0){
         System .out .println ("It is divisible by 3");
     }
     if (number1 % 3 != 0){
         System.out.println("It is not divisible by 3");
     }

    }
}
