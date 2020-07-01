package exam.easy;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Question1 {

    public static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            // TODO 1: rewrite this method.
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person person = (Person) o;
            return age == person.age &&
                Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            // TODO 2: rewrite this method.
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("name1", 1));
        personSet.add(new Person("name1", 2));
        personSet.add(new Person("name1", 3));
        personSet.add(new Person("name2", 1));
        // Expected output: "Size = 3".
        System.out.println("Size = " + personSet.size());
    }
}
