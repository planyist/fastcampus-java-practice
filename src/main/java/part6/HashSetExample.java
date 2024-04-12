package part6;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");
        System.out.println(set.size());

        for (String element : set) {
            System.out.println(element);
        }

        System.out.println("=============");

        set.remove("Banana");
        for (String element : set) {
            System.out.println(element);
        }

        boolean contains = set.contains("Cherry");
        System.out.println("Set contains cherry? " + contains);

        set.clear();

        boolean emtpy = set.isEmpty();
        System.out.println("Set is empty? " + emtpy);
    }
}
