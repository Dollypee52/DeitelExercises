package Chapter5;

import java.util.Random;

public class ArrayNumber {
    public static void main(String[] args) {
        int largest = 0;
        int sum = 0;
        int average = 0;
        int[] numbers = {5, 18, 6, 8, 45, 34, 12, 67, 16, 56};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

        }
            System.out.println();
            System.out.print("The largest number is:" + largest);


        for(int i = 0;i<numbers.length;i++){
            sum= sum + numbers[i];
        }
        System.out.println();
        System.out.print("The sum is:"+sum);

        for(int i = 0;i<numbers.length;i++){
            average = sum / 10;
    }
        System.out.println();
        System.out.print("The average number is: " +average);
    }

}



