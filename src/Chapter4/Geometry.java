package Chapter4;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int n = 5;
        System.out.println("Enter the length of sides: ");
        double s = 6.5;

        double area = n * (s * s) / 4 * Math.tan(Math.PI/n);
        System.out.println("The area of the polygon is: " + area);

    }

}
