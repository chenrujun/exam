package exam.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class TestQuestion4 {

    @Test
    public void testCalculateWordCount(){
        List<String> input = Arrays.asList("a", "b", "a", "c");
        Map<String, Integer> output = Question4.calculateWordCount(input);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 1);
        expected.put("c", 1);
        Assert.assertEquals(expected, output);
    }
}
