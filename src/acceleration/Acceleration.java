package acceleration;

import java.util.Scanner;
 
 public class Acceleration {
 public static void main (String[] args) {
 Scanner input = new Scanner (System.in);

 System.out.print ("Enter initial velocity v0");
 double v0 = input.nextDouble();

 System.out.print ("Enter end velocity v1");
 double v1 = input.nextDouble();

 System.out.print ("Enter time span t");
 double t = input.nextDouble();

 double a = (v1-v0)/t;

 System.out.print ("The average acceleration is " +a);
}
}