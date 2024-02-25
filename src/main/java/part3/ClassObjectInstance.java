package part3;

import model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1;
        Student st2;
        Student st3;
        st1 = new Student("홍길동",
                "컴퓨터공학과",
                37,
                "bit@empas.com",
                2023110,
                "010-1111-1111");
        st2 = new Student("김길동",
                "정보통신공학과",
                27,
                "bit2@empas.com",
                2023111,
                "010-2222-2222");
        st3 = new Student("이길동",
                "경제학과",
                25,
                "bit3@empas.com",
                2023112,
                "010-3333-3333");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
