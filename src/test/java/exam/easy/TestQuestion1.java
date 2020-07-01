package exam.easy;

import exam.easy.Question1.Person;
import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class TestQuestion1 {

    @Test
    public void testEqualsAndHashCode(){
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("name1", 1));
        personSet.add(new Person("name1", 2));
        personSet.add(new Person("name1", 3));
        personSet.add(new Person("name2", 1));
        Assert.assertEquals(3, personSet.size());
    }
}
