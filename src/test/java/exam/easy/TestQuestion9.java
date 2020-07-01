package exam.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestQuestion9 {

    @Test
    public void testGet3Multiples() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = Question9.get3Multiples(input);
        List<Integer> expected = Arrays.asList(3, 6, 9);
        Assert.assertEquals(expected, output);
    }
}
