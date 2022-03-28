package gradeUsingIfAndElse;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade value");
        int value = input.nextInt();

        if(value >= 70  && value <= 100)
            System.out.println("A");
        else if( value >= 65  && value < 70)
            System.out.println("B");
        else if( value >= 50 && value < 65)
            System.out.println("C");
        else if( value >= 35 && value < 50)
            System.out.println("D");
        else if (value >=0 && value <35)
            System.out.println("F");
        else System.out.println(".......");
    }
}
