package part3;

import model.MyUtil2;

public class NonStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        MyUtil2 myUtil = new MyUtil2();
        int c = myUtil.sum(a, b);
        System.out.println("sum = " + c);
    }
}
