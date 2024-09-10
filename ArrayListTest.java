import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        {
            list.add(1);
            list.add(13);
            list.add(14);
            list.add(15);
            Collections.sort(list);
            System.out.println(list);
            for (int i : list) {
                System.out.println("this is inside the loop");
                System.out.println(i);
            }
        }
    }
}
