package Practice;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {

        //Square
        for(int row = 1;row<=10;row++){
            for(int column =1; column<=10; column++){
            System.out.print("* ");}
            System.out.println();
        }
        //Right-angled triangle
        for(int row = 1;row<=10;row++){
            for(int column =1; column<=row; column++){
                System.out.print("* ");}
            System.out.println();
        }
    }
}
