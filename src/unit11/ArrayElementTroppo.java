package unit11;

public class ArrayElementTroppo extends Exception {
    public static final int MAX_NUM = 1000;
    private static final String MESSAGE = "集合元素过多";

    public ArrayElementTroppo() {

    }

    @Override
    public String getMessage() {
        return MESSAGE + "，最大元素限制是 " + MAX_NUM;
    }

    @Override
    public void printStackTrace() {
        System.err.println("打印调用堆栈");
        super.printStackTrace();
    }
}
