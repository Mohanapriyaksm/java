import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsApi {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(6, 7, 8, 3, 6, 1);
        System.out.println(list);
        System.out.println("Normal List");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        System.out.println("Enhanced List");
        for (int n : list) {
            System.out.println(n);
        }
        System.out.println("ForEach");
        list.forEach(n -> System.out.println(n));
    }

}
