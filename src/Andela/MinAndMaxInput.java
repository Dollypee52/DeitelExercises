package Andela;

import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      //  int max = 0;
       // int max = - 2147483648;
        int max = Integer.MIN_VALUE;
        int min = Integer .MAX_VALUE;
       // int min = 2147483647;
       // int min = 0;
       // boolean first = true;


        while(true){

            System.out.println("Enter number : ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }

            }else {
                break;
            }
                scanner.nextLine();
        }
        System.out.println("min number = " + min + " and max number = " + max);
            scanner.close();
    }
}
