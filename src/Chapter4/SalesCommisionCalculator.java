package Chapter4;

import java.util.Scanner;

public class SalesCommisionCalculator {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double sold = 0.0;
            int soldCounter = 0;

            double fixedRate = 200.00;
            double commissionRate = 0.09;

            System.out.print("Enter number of sold item or -1 to quit: ");
            double value = input.nextDouble();

            while (value > 0)
            {
                sold = sold + value;
                soldCounter = soldCounter + 1;

                System.out.print("Enter price of sold item or -1 to quit: ");
                value = input.nextDouble();
            }

            double totalCommission = sold * commissionRate + fixedRate;
            System.out.printf("%nTotal pay for the week is: %f%n", sold);

        }

    }


