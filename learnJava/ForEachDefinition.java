import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachDefinition {
    public static void main(String args[]) {
        List<Integer> li = Arrays.asList(9, 7, 1, 2, 3, 4, 5);
        // Consumer<Integer> con = n -> System.out.println(n);
        // li.forEach(con);
        Stream<Integer> result = li.parallelStream()
                // .filter(n -> n % 2 == 0)// 2,4
                .map(n -> n * 2)// 4,8
                .sorted();
        // .reduce(0, (a, b) -> a + b);// 12
        result.forEach(n -> System.out.println(n));

    }
}
