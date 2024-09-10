
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import VenkatStreams.Timeint;

public class SmallTest {
        public static void main(String[] args) {

                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                System.out.println("Familiar For Loop");
                for (int i = 0; i < numbers.size(); i++) {
                        System.out.println(numbers.get(i));
                }

                System.out.println(" External iterators");
                for (int e : numbers) {
                        System.out.println(e);
                }

                System.out.println("Internal iterators");
                numbers.forEach(new Consumer<Integer>() {
                        public void accept(Integer e) {
                                System.out.println(e);
                        }
                });

                System.out.println(" Lamda Expression");
                numbers.forEach((Integer e) -> System.out.println(e));

                // numbers.forEach(e -> System.out.println(e));

                System.out.println(" Method References");
                numbers.forEach(System.out::println);

                System.out.println("Find the odd numbers and add");
                System.out.println(
                                numbers.stream()
                                                .filter(e -> e % 2 == 0)
                                                .mapToInt(e -> e * 2)
                                                .sum());

                System.out.println("Factor");
                int factor = 2;
                Stream<Integer> factorvalue = numbers.stream()
                                .map(e -> e * factor);
                factorvalue.forEach(System.out::println);

                System.out.println("Double of Square root of even numbers");
                System.out.println(
                                numbers.stream()
                                                .filter(e -> e % 2 == 0)
                                                .mapToDouble(Math::sqrt)
                                                .sum());

                System.out.println("String Value of List");
                numbers.stream()
                                .map(e -> String.valueOf(e))
                                // .map(String::valueOf) //or
                                .forEach(System.out::println);

                System.out.println("Sum  integer using readuce :");
                System.out.println(

                                numbers.stream()
                                                // .reduce(0, (total, e) -> Integer.sum(total, e))
                                                .reduce(0, Integer::sum)
                // .reduce(0, Integer::min)
                );

                System.out.println("this is Concat of String Using Reduce");
                System.out.println(
                                numbers.stream()
                                                .map(String::valueOf)
                                                // .reduce("", (first, last) -> first.concat(last))
                                                .reduce("", String::concat));
                Timeint.code(() -> System.out.println(
                                numbers.parallelStream() // Streams take time Compare to Parallel streams
                                                .filter(e -> e % 2 == 0)
                                                .mapToInt(SmallTest::compute)
                                                .reduce(0, Integer::sum))

                );

                // Order the list find the double of the first even numbers greater thsan 3
                System.out.println("the double of the first even numbers greater thsan 3");
                System.out.println(
                                numbers.stream()
                                                .filter(e -> e > 3)
                                                .filter(e -> e % 2 == 0)
                                                .map(e -> e * 2)
                                                // .findFirst() // Need only one Value in the List
                                                .collect(Collectors.toList()));

                // or
                int result = 0;
                for (int e : numbers) {
                        if (e > 3 && e % 2 == 0) {
                                result = e * 2;
                                break;
                        }
                }
                System.out.println(result);

        }

        public static int compute(int number) {
                try {
                        Thread.sleep(1000);
                } catch (Exception e) {
                }
                return number * 5;

        }
}
