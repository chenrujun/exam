package exam.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestQuestion3 {

    @Test
    public void testRemoveDuplicatedItems() {

        List<String> input = Arrays.asList("a", "b", "a", "c");
        List<String> output = Question3.removeDuplicatedItems(input);
        Assert.assertEquals(Arrays.asList("a", "b", "c"), output);
    }
}
