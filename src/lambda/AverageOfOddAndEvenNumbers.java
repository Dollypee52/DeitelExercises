package lambda;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.IntStream;

public class AverageOfOddAndEvenNumbers {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        IntStream stream = secureRandom.ints(10, 0, 1001);
        List<Integer> list = stream.boxed().toList();

        long evenCount = list.stream().filter(x -> x % 2 == 0)
                .count();

        long oddCount = list.stream().filter(x -> x % 2 != 0)
                .count();

        double evenAverage = (list.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum) * 1.0) / evenCount;

        double oddAverage = (list.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum) * 1.0) /oddCount;

        double average = (list.stream().reduce(0, Integer::sum)) * 1.0 / list.size();

        System.out.println(list);
        System.out.println(evenCount);
        System.out.println(oddCount);
        System.out.println(evenAverage);
        System.out.println(oddAverage);
        System.out.println(average);
    }
}
