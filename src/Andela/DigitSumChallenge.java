package Andela;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The Sum of the digit in number 125 is " + digitSum(125));
        System.out.println("The Sum of the digit in number -125 is " + digitSum(-125));
        System.out.println("The Sum of the digit in number 4 is " + digitSum(4));
        System.out.println("The Sum of the digit in number 32123 is " + digitSum(32123));
    }

    public static int digitSum(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        // 125 --> 125 / 10 = 12 --> 12 * 10 = 120 --> 125 - 120 = 5
        while(number > 0){
            //extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least-significant digit
            number /= 10;  // same as number = number / 10
        }
        return sum;
    }
}
