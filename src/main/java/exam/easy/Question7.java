package exam.easy;

public interface Question7 {

    char firstChar(String s); // TODO 2: Add default implementation for the interface method.

    class Question7Impl implements Question7{
        public char firstChar(String s) { // TODO 1: Remove this function
            return '-';
        }
    }

    static void main(String[] args) {
        Question7 question7 = new Question7Impl();
        // Expected output: "a"
        System.out.println(question7.firstChar("abc"));
    }
}
