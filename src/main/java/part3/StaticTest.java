package part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = sum(a, b);
        System.out.println("sum = " + c);
    }

    public static int sum(int a, int b) {
        int v = a + b;

        return v;
    }
}
