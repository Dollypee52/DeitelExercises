package Chapter2;

import java.util.Scanner;

public class Conversion {
public static void main (String[] args) {
Scanner input = new Scanner (System.in);

System.out.print ("Enter value for foot:");
double feet = input.nextDouble();

double meter = feet * 0.305;

System.out.print (feet + " feet is " + meter + " meter ");
}
}