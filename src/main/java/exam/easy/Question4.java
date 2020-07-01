package exam.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question4 {

    public static Map<String, Integer> calculateWordCount(List<String> input) {
        // TODO: implement this method.
        return new HashMap<>();
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("a", "b", "a", "c");
        // Expected output: "a:2 b:1 c:1"
        calculateWordCount(input).forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }
}
