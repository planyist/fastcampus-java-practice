package part6;

import model.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add = (int x, int y) -> {
            return x + y;
        };
        MathOperation mul = (x, y) -> x * y;
        int result = add.operation(10, 20);
        int result2 = mul.operation(10, 20);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }
}
