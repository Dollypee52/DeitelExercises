package HackerrankExercises;

import java.math.BigInteger;

public class ExtraLongFactorial {
    public static void main(String[] args) {
        System.out.println(extraLongFactorial(75));

    }

    public static BigInteger extraLongFactorial(int n) {


        BigInteger answer = BigInteger.ONE;

        if (n < 2) {
            return BigInteger.ONE;
        }
        answer = BigInteger.valueOf(n).multiply(extraLongFactorial(n-1));
          return answer;
    }
}
