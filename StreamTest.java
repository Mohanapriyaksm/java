import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static List<Integer> addTest(List<Integer> list, Integer x) {
        return list.stream().map(n -> n + x).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> ans = new ArrayList<>();
        ans = addTest(list, 3);
        System.out.println(ans);
        System.out.println("Integer stream ");
        IntStream.range(1, 20).forEach(System.out::print);
        System.out.println("to Skip Something");
        IntStream.range(1, 10).skip(6).forEach(x -> System.out.println(x));
        System.out.println(IntStream.range(10, 20).sum());
        System.out.println("Find the First");
        Stream.of("Hi", "Mona", "Learning", "Java", "?").findAny().ifPresent(System.out::print);
        String[] names = { "java", " csharp", "C", "node", "nightwork", "na", "html", "js", "sass", "artificalIntelli",
                "Coding" };
        System.out.println();
        Arrays.stream(names).filter(x -> x.startsWith("n")).sorted().forEach(System.out::println);
        Arrays.stream(new int[] { 1, 2 }).map(x -> x + 3).average().ifPresent(System.out::println);
        System.out.println("this is List");
        List<String> people = Arrays.asList(
                "AI", "Matlab", "Scikit", "TensorFlow",
                "OpenCV", "DeepLearning", "NLP",
                "NeuralNetworks");
        people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
        System.out.println("Readuction :");
        double total = Stream.of(1.1, 1.3).reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);
        IntSummaryStatistics summary = IntStream.of(2, 3, 3, 5, 7).summaryStatistics();
        System.out.println(summary);

    }
}
