package part3;

import model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동", 50, "010-1111-1111");

        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
        System.out.println(vo);
        System.out.println(vo);
    }
}
