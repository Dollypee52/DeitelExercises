package Chapter3;

import java.util.Scanner;

public class runwayLength {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);

System.out.print ("Enter the velocity v: ");
double velocity = input.nextDouble();

System.out.print ("Enter the acceleration a: ");
double acceleration = input.nextDouble();

double length = (velocity*velocity)/(2*acceleration);

System.out.print ("The minimum runway length for this airplane is: " +length);
}
}