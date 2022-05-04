package Chapter8.chapter5;

import java.util.Scanner;

public class Kilogramtopounds {
//    (Conversion from kilograms to pounds) Write a program that displays the follow-
//    ing table (note that 1 kilogram is 2.2 pounds):
    public static void main(String[] args) {
        double POUNDS_PER_KILOGRAM = 2.2;

        // Display header for table
        System.out.println("Kilograms      Pounds");


        for (int i = 1; i <= 199; i += 2) {
            System.out.printf(
                    "%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));
        }
    }
}


