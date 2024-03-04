package part4;

import poly.Animal;
import poly.Cat;
import poly.Dog;

public class AbstractTest {
    public static void main(String[] args) {
        // Animal ani = new Animal();
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat) ani).night();
    }
}
