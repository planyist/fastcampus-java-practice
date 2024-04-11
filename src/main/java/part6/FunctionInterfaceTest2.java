package part6;

import model.MathOperation;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation() {

            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };
        int result = mo.operation(10, 20);
        System.out.println("result = " + result);
    }
}
