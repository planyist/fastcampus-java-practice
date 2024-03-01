package part4;

import model.Animal;
import model.Cat;
import model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);

        Cat c = new Cat();
        display(c);
    }

    private static void display(Animal ani) {
        ani.eat();
        if (ani instanceof Cat) {
            ((Cat) ani).night();
        }
    }

}
