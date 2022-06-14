package Exercises.Chapter5;

import java.util.Scanner;

public class ConvertPoundsIntoKilogram {
public static void main (String[] args) {
Scanner input = new Scanner (System.in);

System.out.print ("Enter number in pounds: ");
double pounds = input.nextDouble();

double kilograms =pounds * 0.454;

System.out.print ("kilograms:" +kilograms);

}
}