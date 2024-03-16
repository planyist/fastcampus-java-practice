package part4;

import poly.A;
import poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object obj) {
        if (obj instanceof A) {
            ((A) obj).printGo();
        } else if (obj instanceof B) {
            ((B) obj).printGo();
        }
    }

}
