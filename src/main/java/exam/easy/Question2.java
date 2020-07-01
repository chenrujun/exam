package exam.easy;

import java.util.Arrays;
import java.util.List;

public class Question2 {

    static void sortStringByLength(List<String> input) {
        // TODO: implement this method.
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("aa", "b", "ccc");
        sortStringByLength(input);
        // Expected output: "b aa ccc"
        input.forEach(System.out::println);
    }
}
