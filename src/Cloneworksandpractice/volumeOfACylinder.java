package Cloneworksandpractice;

import java.util.Scanner;

public class volumeOfACylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for radius: ");
        double radius = input.nextDouble();

        System.out.println("enter the value for a cylinder length: ");
        double length = input.nextDouble();

        double area = radius * radius * 3.142;
        double volume = area * length;

        System.out.println("The area is:" +area);
        System.out.println("The volume is:" +volume);

    }


}
