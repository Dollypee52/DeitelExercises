package Chapter5;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("n       sum");

       // int sum = 0;
        for(int i=1; i<=100; i++){
            System.out.printf("%d%8d%n", i, (i + i));
           // sum += i;


        }
    }
}
