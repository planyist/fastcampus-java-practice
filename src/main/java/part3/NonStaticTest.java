package part3;

public class NonStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // int c = sum(a, b);

        NonStaticTest st = new NonStaticTest();
        int c = st.sum(a, b);
        System.out.println("sum = " + c);
    }

    public int sum(int a, int b) {
        int v = a + b;

        return v;
    }
}
