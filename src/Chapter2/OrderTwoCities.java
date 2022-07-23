package Chapter2;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter city1: ");
        String city1 = input.nextLine();
        System.out.println("Enter city2: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are" +
                    " " + city1 + " followby " + city2);
        else
            System.out.println("The cities in alphabetical order are "
                    + city2 + " followby " + city1);

    }
}
