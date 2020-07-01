package exam.easy;

import java.util.Arrays;
import java.util.List;

public class Question9 {

    public static List<Integer> get3Multiples(List<Integer> input) {
        // TODO: implement this method.
        return input;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = get3Multiples(input);
        // Expected output: "3 6 9"
        output.forEach(System.out::println);
    }
}
