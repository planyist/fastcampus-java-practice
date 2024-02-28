package part4;

import model.Animal;
import model.Cat;
import model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
