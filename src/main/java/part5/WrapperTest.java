package part5;

public class WrapperTest {
    public static void main(String[] args) {
        int a = 10;
        Integer aa = 10;
        System.out.println(aa.intValue());

        Integer bb = 20;
        int b = bb;
        System.out.println(Integer.valueOf(b));

        float f = 10.5f;
        Float ff = 45.6f;
        System.out.println(ff.floatValue());

        Float af = 49.1f;
        float aff = af;
        System.out.println(Float.valueOf(aff));
    }
}
