import java.util.*;
import java.util.LinkedList;

public class LinkedListPollApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast("Its me Last");
        list.add("Mohana");
        list.add("Priya");
        list.add("kohila");
        list.addFirst("Nantha");
        System.out.println("this is intial List :" + list);
        System.out.println("this is ALready Exit");
        while (!list.isEmpty()) {
            System.out.print(list.poll() + "<--");

            // list.addLast("this is Last");
            // System.out.println(list);

        }

    }

}