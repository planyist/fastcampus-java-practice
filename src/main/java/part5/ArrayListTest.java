package part5;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

        Book vo = (Book) list.get(0);
        System.out.println(vo.toString());

        vo = (Book) list.get(1);
        System.out.println(vo.toString());

        vo = (Book) list.get(2);
        System.out.println(vo.toString());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
