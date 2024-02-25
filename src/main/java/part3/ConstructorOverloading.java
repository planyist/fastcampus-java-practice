package part3;

import model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동", 30, "010-5555-5555");
        PersonVO vo2 = new PersonVO("나길동", 60, "010-2222-2222");
        PersonVO vo3 = new PersonVO("조길동", 40, "010-3333-3333");
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
        System.out.println(vo2.getName() + "\t" + vo2.getAge() + "\t" + vo2.getPhone());
        System.out.println(vo3.getName() + "\t" + vo3.getAge() + "\t" + vo3.getPhone());
    }
}
