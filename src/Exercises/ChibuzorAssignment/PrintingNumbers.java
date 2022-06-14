package Exercises.ChibuzorAssignment;

import java.util.Scanner;

public class PrintingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers= new int[5];
        System.out.println("Enter 5 numbers: ");
        numbers[0] = input.nextInt();
        int sum = numbers[0];
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] > largest){largest = numbers[i];}
            if (numbers[i] < smallest){smallest = numbers[i];}
            sum = sum + numbers[i];
        }
        int average = sum/ numbers.length;
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+average);
        System.out.println("The largest is "+largest);
        System.out.println("The smallest is "+smallest);
//        for (int i = 0; i < numbers.length ; i++) {
//            System.out.print(numbers[i]+" ");
//        }

    }
}
