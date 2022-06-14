package Cloneworksandpractice;

import java.util.Scanner;

public class DateOfBirth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        input.nextInt();

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        int age = 2018 - yearOfBirth;

        if(age >= 0 && age <= 100){
            System.out.println("Your name is " + name + ",and you are " + age + "years old");

        }
        else{
            System.out.println("Invalid year of birth");

        }
    }
}
