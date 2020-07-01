package exam.easy;

public class Question5 {

    public static int[] copyIntArray(int[] input) {
        // TODO: implement this method.
        return new int[1];
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        int[] output = copyIntArray(input);
        input[0] = 4;
        // Expected output: "1 2 3"
        for (int value : output) {
            System.out.println(value);
        }
    }
}
