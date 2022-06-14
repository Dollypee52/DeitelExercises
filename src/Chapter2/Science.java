package Chapter2;

import java.util.Scanner;

public class Science {
public static void main (String[] args) {
Scanner input = new Scanner (System.in);

System.out.print ("Enter the weight of water in kg: ");
double mass = input.nextDouble();

System.out.print ("Enter the initial temperature: ");
double initialTemperature = input.nextDouble();

System.out.print ("Enter the final temperature: ");
double finalTemperature = input.nextDouble();

double energy = mass * (finalTemperature - initialTemperature) *4184;

System.out.print ("The energy needed is " +energy);

}
}   