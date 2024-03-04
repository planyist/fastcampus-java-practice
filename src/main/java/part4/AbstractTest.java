package part4;

import poly.Animal;
import poly.Cat;
import poly.Dog;

public class AbstractTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
