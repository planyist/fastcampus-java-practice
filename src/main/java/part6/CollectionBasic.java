package part6;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int data : list) {
            System.out.println(data);
        }
    }
}
