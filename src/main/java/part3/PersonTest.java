package part3;

public class PersonTest {
    public static void main(String[] args) {
        Person p;
        p = new Person();

        Person p2 = new Person();

        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1111-1111";

        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}
