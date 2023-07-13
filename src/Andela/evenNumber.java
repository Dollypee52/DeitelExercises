package Andela;

public class evenNumber {
    public static void main(String[] args) {

        int num = 4;
        int lastNUmber = 20;
        int evenNumbersFound= 0;

        while(num <= lastNUmber){
            num++;
            if(!isEvenNumber(num)){
                continue;
            }
            System.out.println("Even number = " + num);
            evenNumbersFound++;
            if(evenNumbersFound == 5){
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int num) {
       if(num % 2 == 0){
           return true;
       }else{
           return false;
       }
}}