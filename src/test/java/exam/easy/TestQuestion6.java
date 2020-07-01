package exam.easy;

import org.junit.Assert;
import org.junit.Test;

public class TestQuestion6 {

    @Test
    public void testReplaceAllSubString() {
        String input = "aaaa1bbbb11cccc111dd111";
        String output = Question6.replaceAllSubString(input, "11", "22");
        Assert.assertEquals("aaaa1bbbb22cccc221dd221", output);
    }
}
