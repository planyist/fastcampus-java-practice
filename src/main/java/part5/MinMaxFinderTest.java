package part5;

import model.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
