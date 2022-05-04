package Cloneworksandpractice;

import java.util.Scanner;

public class methods {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter num1");
        int num1 = input.nextInt();
        System.out.println("enter num2");
        int num2 = input.nextInt();

        addNUmber(num1,num2);
        subNumber(num1,num2);
    }
    public static void addNUmber(int num1, int num2){
        int total = num1 + num2;
        System.out.println("answer is " +total);
    }
    public static void subNumber(int num1, int num2){
        int minus = num1 - num2;
        System.out.println("answer is " +minus);
    }
}
