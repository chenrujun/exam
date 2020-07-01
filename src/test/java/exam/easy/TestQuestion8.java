package exam.easy;

import org.junit.Assert;
import org.junit.Test;

public class TestQuestion8 {

    @Test
    public void testMaxValue() {
        int[] input = {1, 3, 5, 7, 2, 4, 6, 8};
        int output = Question8.maxValue(input);
        Assert.assertEquals(8, output);
    }
}
