package chapter5;

import java.util.Scanner;

public class Kilogramtopounds {
//    (Conversion from kilograms to pounds) Write a program that displays the follow-
//    ing table (note that 1 kilogram is 2.2 pounds):
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2; 	// Create constant

        // Display header for table
        System.out.println("Kilograms      Pounds");

        // Display table
        for (int i = 1; i <= 199; i += 2) {
            System.out.printf(
                    "%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));
        }
    }
}


