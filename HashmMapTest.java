import java.util.Collections;
import java.util.HashMap;

public class HashmMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> mapValue = new HashMap<String, Integer>();
        mapValue.put("One", 1);
        mapValue.put("two", 2);
        // System.out.println(mapValue);

        System.out.println(mapValue.get(1));
        for (String i : mapValue.keySet()) {
            System.out.println(i);
            mapValue.clear();
        }
        // for (String i : mapValue) {
        // System.out.println(i);
        // System.out.println("This is Clear");
        // mapValue.clear();

        // }

    }
}