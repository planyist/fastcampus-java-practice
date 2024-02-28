package part4;

import model.Cat;
import model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();
    }
}
