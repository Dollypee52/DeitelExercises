package Chapter8.chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        int smallest = 0;
        int largest = 0;
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        num = input.nextInt();
        smallest = num;
        for (int i = 1; i < 5; i++) {
            num = input.nextInt();
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("the largest is: " + largest);
        System.out.println("Smallest no is : " + smallest);

        for (int i = 1; i < 5; i++) {
            sum = smallest + largest;
        }
        System.out.println("The sum of the largest and smallest is " +sum);
    }
}
