package part6;

import model.Person;
import model.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("홍길동", 40);
        System.out.println(person);

        PersonFactory personFactory1 = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person1 = personFactory1.create("김길동", 30);
        System.out.println(person1);
    }
}
