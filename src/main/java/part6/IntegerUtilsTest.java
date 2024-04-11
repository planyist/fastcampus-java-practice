package part6;

import model.Converter;
import model.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        int result = converter.convert("123");
        System.out.println("result = " + result);
    }
}
