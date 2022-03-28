package Chapter2;
import java.util.Scanner;
public class diameter {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the radius of circle: ");
        int radius = input.nextInt();

        int diameter = 2 * radius;
        System.out.println ("The diameter of a circle is: " +diameter);

        int circumference = 2 * 22 / 7 * 6;
        System.out.println ("The circumference is: " +circumference);

        int area = 22 / 7 * diameter;
        System.out.println ("The area of the circle is: "+area);


    }
}
