package part4;

import model.Animal;
import model.Cat;
import model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display(ani);
    }

    private static void display(Animal[] ani) {
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();
            if (ani[i] instanceof Cat) {
                ((Cat) ani[i]).night();
            }
        }
    }
}
