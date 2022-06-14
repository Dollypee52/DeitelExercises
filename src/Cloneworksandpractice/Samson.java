package Cloneworksandpractice;

import java.util.Arrays;

public class Samson {
    public static void main(String[] args) {
        array();
        array1();
    }
    private static int num1;
    private static int num2;
    public Samson(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static double sum(int num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    public static void move(){
        System.out.println("I am moving");
    }

    public static void array(){
        int[] arrays = new int[5];
        for (int i = 0; i < 5; i++) {
            arrays[i] = 5*i;
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
        System.out.println("The array is "+ Arrays.toString(arrays));
    }

    public static void array1(){;
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
