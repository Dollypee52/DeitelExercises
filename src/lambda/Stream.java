package lambda;

import java.security.SecureRandom;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
      //  int product = IntStream.rangeClosed(1,5).reduce(5,(acc, el) -> acc * el);
      //  System.out.println(product);

      //  int minimum = IntStream.rangeClosed(1,8).min().getAsInt();
        //  System.out.println(minimum);

       // int triple = IntStream.rangeClosed(1,20).filter((x) -> x%2==1)
       //         .map(x->x*x*x).sum();
       // System.out.println(triple);

       // SecureRandom randomNumbers = new SecureRandom();
      //  secureRandom.ints(10,1,7)
      //          .filter(x -> x % 2 == 0).forEach(System.out::println);


       // SecureRandom randomNumbers = new SecureRandom();
      // String result =  random.ints(20,1,14)
       //          .mapToObj(String::valueOf).collect(Collectors.joining("-"));
      //  System.out.println(result);

      //  int [] values = {34,67,8,54,21,98,44};

      //  String a = IntStream.of(values).mapToObj(String::valueOf).collect(Collectors.joining("-"));
      //  System.out.println(a);


//        String input  = new Scanner(System.in).nextLine();
//
//        input = input.toLowerCase();
//        String[] elements = input.split(" ");
//        List<String> stringList = Stream.of(elements).sorted().distinct().toList();
//        System.out.println(stringList);


        //sum the integers from 1 through 10 with IntStream
       // System.out.printf("sum of 1 through 10 is: %d%n",
         //       IntStream.rangeClosed(1,10).sum());

        //sum the even integers from 2 through 20
        //System.out.printf("Sum of the even int from 2 through 20 is: %d%n",
        //       IntStream.rangeClosed(1,10).map((int x)-> {return x * 2;}).sum());


    }
}
