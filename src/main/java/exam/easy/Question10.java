package exam.easy;

public interface Question10 {

    default String getString() {
        return "default string";
    }

    class Question10Impl implements Question10 {
        // TODO: overwrite method "getString()".
    }

    static void main(String[] args) {
        Question10 question10 = new Question10Impl();
        // Expected output: "overwrite"
        System.out.println(question10.getString());
    }

}
