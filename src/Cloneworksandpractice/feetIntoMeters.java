package Cloneworksandpractice;

import java.util.Scanner;

public class feetIntoMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();
        double footInMeter = 0.305;
        double result = feet  * footInMeter;

        System.out.println(feet +  "  feet is " +result+ " meters ");


    }
}
