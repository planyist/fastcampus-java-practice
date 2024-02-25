package part3;

import model.Student;

public class StudentTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 67;
        arr[3] = 98;
        arr[4] = 55;
        arr[5] = 32;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Student vo = new Student("홍길동",
                "컴퓨터공학과",
                37,
                "bit@empas.com",
                2023110,
                "010-1111-1111");

        System.out.println(vo);
    }
}
