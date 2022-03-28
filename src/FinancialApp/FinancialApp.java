package FinancialApp;

import java.util.Scanner;

 public class FinancialApp {
 public static void main (String[] args) {
 Scanner input = new Scanner (System.in);

 System.out.print ("Enter amount for monthly savings");
 double amountMonthlySavings = input.nextDouble();
 
 double monthlyinterestrate = 0.05/12;
 double constantK = (1 + 0.00417);

 double month1 = (amountMonthlySavings) * constantK;
 double month2 = (amountMonthlySavings + month1) * constantK;
 double month3 = (amountMonthlySavings + month2) * constantK;
 double month4 = (amountMonthlySavings + month3) * constantK;
 double month5 = (amountMonthlySavings + month4) * constantK;
 double month6 = (amountMonthlySavings + month5) * constantK;

 System.out.println ("After sixth month " +month6);

}
}
 
