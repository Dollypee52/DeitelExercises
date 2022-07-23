package Chapter2;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        String letter = input.nextLine();

        switch (letter) {
            case "A":
                System.out.println("" + letter + " is a vowel");
                break;
            case "E":
                System.out.println("" + letter + " is a vowel");
                break;

            case "I":
                System.out.println("" + letter + " is a vowel");
                break;
            case "O":
                System.out.println("" + letter + " is a vowel");
                break;
            case "U":
                System.out.println("" + letter + " is a vowel");
                break;
            default:
                System.out.println(" " + letter + " is a consonant");

        }

    }

    }

