package exam;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestExample {

    @Test
    @Ignore
    public void testMaxValue(){
        int result = Example.maxValue(1, 2);
        Assert.assertEquals(2, result);
    }
}
