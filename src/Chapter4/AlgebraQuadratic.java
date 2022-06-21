package Chapter4;

import java.util.Scanner;

public class AlgebraQuadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for a :");
        double a = input.nextDouble();
        System.out.println("Enter value for b :");
        double b = input.nextDouble();
        System.out.println("Enter value for c :");
        double c = input.nextDouble();

        double root1 = -b + Math.sqrt(b * b - (4 * a * c))/(2 * a);
        double root2 = -b - Math.sqrt(b * b - (4 * a * c))/(2 * a);

        double discriminant = b * b - (4 * a * c);

        if (discriminant > 0 ) System.out.println("The equation has two roots: " +root1 +root2);
        else if (discriminant == 0 ) System.out.println("The equation has one root: " +root1);
        else System.out.println("The equation has no root" );

        }

    }

