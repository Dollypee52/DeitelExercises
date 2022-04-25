package chapter5.ArraysPractice;

import java.util.Random;

public class generatePassword {
    public static void main(String[] args) {
        String lower = "qwertyuiopasdfghjklzxcvbnm";
        String Upper = "QWERTYUIOPADSFGHJKLZXCVBNM";
        String numbers = "0123456789";
        String combination = Upper+lower+numbers;
        int length = 12;
        char[] password = new char[length];
        Random r = new Random();

        for(int i=0;i<12;i++){
            password[i]= combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated password is:" +new String(password));

    }
}
