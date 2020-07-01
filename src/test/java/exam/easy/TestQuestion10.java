package exam.easy;

import exam.easy.Question10.Question10Impl;
import org.junit.Assert;
import org.junit.Test;

public class TestQuestion10 {

    @Test
    public void testOverwrite() {
        Question10 question10 = new Question10Impl();
        Assert.assertEquals("overwrite", question10.getString());
    }
}
