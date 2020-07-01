package exam.easy;

import org.junit.Assert;
import org.junit.Test;

public class TestQuestion5 {

    @Test
    public void testCopyIntArray() {
        int[] input = {1, 2, 3};
        int[] output = Question5.copyIntArray(input);
        input[0] = 4;
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, output);
    }
}
