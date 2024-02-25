package part3;

import model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] std = new Student[4];
        std[0] = new Student("홍길동",
                "컴공",
                37,
                "bit@empas.com",
                2023110,
                "010-1111-1111");
        std[1] = new Student("나길동",
                "전기",
                37,
                "bit@empas.com",
                2023111,
                "010-2222-2222");
        std[2] = new Student("김길동",
                "건축",
                37,
                "bit@empas.com",
                2023112,
                "010-3333-3333");
        std[3] = new Student("이길동",
                "통신",
                37,
                "bit@empas.com",
                2023113,
                "010-4444-4444");

        for (Student student : std) {
            System.out.println(student);
        }
    }
}
