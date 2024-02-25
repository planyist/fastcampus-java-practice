package part3;

import model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());

        PersonVO vo2 = new PersonVO();
        System.out.println(vo2.getName() + "\t" + vo2.getAge() + "\t" + vo2.getPhone());
    }
}
