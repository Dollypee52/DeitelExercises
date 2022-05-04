package Exercises;

import java.util.Scanner;

public class PackOfMilk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Go to the shop and bring a pack of milk");

        System.out.print("enter no of eggs");
        int eggs = input.nextInt();

        if (eggs >= 6)
            System.out.print("bring"   + 6 + "eggs");
        else
            System.out.print("no eggs");
    }
}
