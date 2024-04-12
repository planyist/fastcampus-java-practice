package part6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sumOfEvenNumber = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sumOfEvenNumber += num;
            }
        }
        System.out.println("sumOfEvenNumber = " + sumOfEvenNumber);

        IntStream stream = Arrays.stream(numbers);
        int sumOfEvenNumber2 = stream.filter(n -> n % 2 == 0).sum();
        System.out.println("sumOfEvenNumber2 = " + sumOfEvenNumber2);

        int sumOfEvenNumber3 = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("sumOfEvenNumber3 = " + sumOfEvenNumber3);

        int[] evenArrays = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
        for (int even : evenArrays) {
            System.out.println("even = " + even);
        }
    }
}
