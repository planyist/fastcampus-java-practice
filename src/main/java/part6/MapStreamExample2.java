package part6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "orange");
        List<String> uppercase = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("uppercase = " + uppercase);
        for (String str : uppercase) {
            System.out.println("str = " + str);
        }
    }
}
