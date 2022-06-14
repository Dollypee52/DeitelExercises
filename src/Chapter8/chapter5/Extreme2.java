package Chapter8.chapter5;

import java.util.Scanner;

public class Extreme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int num = input.nextInt();
        int maximum = 0;
        int minimum = 0;
        int sum = 0;

        minimum = num;

        for(int i = 0; i<5; i++) {
            num = input.nextInt();
            if (num > maximum) {
                maximum = num;
                if (num < minimum) {
                    minimum = num;
                }


            }
        }
            System.out.println("The largest number is: "+maximum);
            System.out.println("The smallest number is: "+minimum);

            for(int i = 0; i<5; i++){
                sum = maximum + minimum;
            }
            System.out.println("The sum is: "+sum);

        }
    }

