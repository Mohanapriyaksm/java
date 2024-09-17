import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String args[]) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                if (i1 % 10 > i2 % 10)
                    return 1;
                else
                    return -1;

            }
        };
        List<Integer> li = new ArrayList<>();
        li.add(90);
        li.add(65);
        li.add(42);
        li.add(97);
        li.add(21);
        Collections.sort(li, com);
        System.out.println(li);

    }
}
