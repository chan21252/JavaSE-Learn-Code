package work.baseexercise.oop.exercise04;

public class TestPlainRect {
    public static void main(String[] args) {
        PlainRect plainRect = new PlainRect(20, 10, 10, 10);

        System.out.println(plainRect.isInside(25.5, 13));
    }
}
