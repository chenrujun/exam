package exam.easy;

import exam.easy.Question7.Question7Impl;
import org.junit.Assert;
import org.junit.Test;

public class TestQuestion7 {

    @Test
    public void testDefaultImplementationInInterface() {
        Question7 question7 = new Question7Impl();
        Assert.assertEquals('a', question7.firstChar("abc"));
    }
}
