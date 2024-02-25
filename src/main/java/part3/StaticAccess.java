package part3;

import model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = MyUtil.sum(a, b);
        System.out.println("sum = " + c);
    }
}
