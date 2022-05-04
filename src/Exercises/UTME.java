package Exercises;

import java.util.Scanner;

public class UTME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of copies");
        int copies = input.nextInt();

        if (copies <= 4 && copies >= 1)
            System.out.print(2000 + " naira per copy");


        if(copies <= 9 && copies >= 5)
            System.out.print( 1800 + "naira per copy");

        if (copies <= 29 && copies >= 10)
            System.out.print(1600 + "naira per copy");

        if (copies <= 49 && copies >= 30)
            System.out.print(1600 + "naira per copy");

        if (copies <= 99 && copies >= 50)
            System.out.print(1600 + "naira per copy");

        if (copies <= 199 && copies >= 100)
            System.out.print(1600 + "naira per copy");

        if (copies <= 499 && copies >= 200)
            System.out.print(1100 + "naira per copy");

        if (copies >= 500)
            System.out.print(1600 + "naira per copy");


    }

}
