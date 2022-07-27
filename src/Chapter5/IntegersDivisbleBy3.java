package Chapter5;

import java.util.Scanner;

public class IntegersDivisbleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int sum=0;

        for(int i=1; i <= 30; i++){
            int numbers = input.nextInt();
            if(numbers % 3 == 0){
                sum +=i;


            }
        }
        System.out.println("The sum of the integers are: "+sum);

    }

    }

