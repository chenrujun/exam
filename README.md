# How to take this exam?

For example, in `exam.Example.java`:

### step 1: finish `TODO`, like this:
```java
public class Example {

    public static int maxValue(int value1, int value2) {
        if (value1 >= value2) {
            return value1;
        } else {
            return value2;
        }
    }
    
    public static void main(String[] args) {
        int result = maxValue(1, 2);
        // Expected output: "result = 2"
        System.out.println("result = " + result);
    }
}
```

**Warning:** You are only allowed to modify code in the place of `TODO`, it's forbidden to modify other code.

### step 2: Run `main` method in the class, make sure the output is same to the `Expected output`.

### step 3: After finish all `TODO`, run `mvn clean verify --fail-at-end`. 
The log may contain content this:
```
Tests run: 11, Failures: 10, Errors: 0, Skipped: 1
```
The accurate rate = (10 - Failures - Errors) / 10 * 100%. In above example log, the accurate is 0%.