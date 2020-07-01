package exam.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestQuestion2 {

    @Test
    public void testSortStringByLength() {
        List<String> input = Arrays.asList("aa", "b", "ccc");
        Question2.sortStringByLength(input);
        Assert.assertEquals(Arrays.asList("b", "aa", "ccc"), input);
    }
}
