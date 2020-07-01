package exam.easy;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static List<String> removeDuplicatedItems(List<String> input) {
        // TODO: implement this method.
        return input;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("a", "b", "a", "c");
        // Expected output: "a b c"
        removeDuplicatedItems(input).forEach(System.out::println);
    }
}
