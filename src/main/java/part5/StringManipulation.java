package part5;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.charAt(1));
        System.out.println(str.replace("o", "X"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 8));
        System.out.println(str.indexOf("Wor"));
        System.out.println(str.indexOf("Wr"));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
