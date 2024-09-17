//Collection API
//Collection -Interface
//Collections - Class

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;

public class CollectionTesting {
    public static void main(String args[]) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(9);
        nums.add(90);
        nums.add(10);
        for (int n : nums) {

            System.out.println(n);
        }
        ArrayList<String> str = new ArrayList<String>();
        str.add("THis");
        str.add("Is ");
        str.add("String");
        System.out.println(str.indexOf("THis"));
        System.out.println("This is example for Hash Set , Its not ordered");
        Set<Integer> set = new HashSet<Integer>();
        set.add(62);
        set.add(54);
        set.add(82);
        set.add(21);
        for (int n : set) {
            System.out.println(n);
        }
        System.out.println("This is example for Tree Set , Its  ordered");
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(62);
        treeSet.add(54);
        treeSet.add(82);
        treeSet.add(21);
        Iterator<Integer> values = treeSet.iterator();
        while (values.hasNext())
            System.out.println(values.next());
        // for (int n : treeSet) {
        // System.out.println(n);
        // }
        System.out.println("Exploring Map");
        Map<String, Integer> map = new HashMap<>();
        map.put("Mona", 99);
        map.put("Priya", 79);
        map.put("Thenmu", 89);
        map.put("Subu", 39);
        for (String key : map.keySet()) {

            System.out.println(key + ":" + map.get(key));
        }

    }
}
