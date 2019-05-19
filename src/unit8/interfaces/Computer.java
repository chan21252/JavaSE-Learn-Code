package unit8.interfaces;

public abstract interface Computer {
    /* 定义公共、静态的常量 */
    public static final int MAX_NUM = 5000;

    /**
     * 接口中只允许定义公共的抽象方法
     */
    public abstract double count(int num, int num2, char tag);
}
