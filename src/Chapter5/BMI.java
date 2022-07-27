package Chapter5;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg" );
        double weightInKilograms = input.nextDouble();

        System.out.println("Enter height in Meters" );
        double heightInMeters = input.nextDouble();

        double BMI = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("The calculation gives:" +BMI);

        if(BMI < 18.5){
            System.out.println("you are in the underweight range");}

        else if(BMI > 18.5 && BMI <= 24.9){
            System.out.println("you are in the healthy weight range");}
        else if(BMI > 24.9 && BMI <= 29.9){
            System.out.println("you are in the overweight range");
        }
        else if(BMI > 29.9 && BMI <= 39.9){
            System.out.println("you are in the obese range");}
        else
            System.out.print("you need to see doctor");





    }

}
