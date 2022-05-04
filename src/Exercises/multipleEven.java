package Exercises;

import java.util.Scanner;

public class multipleEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();

        if(number % 2 == 0)
            System.out.println("it is even" +number);
        else if(number % 5 == 0)
            System.out.println("it is multiple" +number);

    }
}
