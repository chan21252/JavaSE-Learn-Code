package work.CompreExercise;

import java.util.Arrays;

public class StringBuilder {
    /**
     * 允许的数组最大长度
     */
    private final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    /**
     * 存储的字符
     */
    private char[] value;
    /**
     * 已存储的字符数
     */
    private int count;

    /**
     * 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
     */
    public StringBuilder() {
        value = new char[16];
    }

    /**
     * 构造一个不带任何字符的字符串生成器，其初始容量由 capacity 参数指定。
     *
     * @param capacity 初始容量。
     * @throws NegativeArraySizeException 如果 capacity 参数小于 0。
     */
    private StringBuilder(int capacity) {
        value = new char[capacity];
    }

    /**
     * 构造一个字符串生成器，并初始化为指定的字符串内容。
     *
     * @param str 缓冲区的初始内容。
     * @throws NullPointerException 如果 str 为 null
     */
    public StringBuilder(String str) {
        append(str);
    }

    /**
     * 将指定的字符串追加到此字符序列。
     * 按顺序追加 String 变量中的字符，此序列将增加该变量的长度。如果 str 为 null，则追加 4 个字符 "null"。
     *
     * @param str 一个 string。
     * @return 此对象的一个引用。
     */
    public StringBuilder append(String str) {
        if (str == null) {
            return this;
        }

        int length = str.length();
        ensureCapacityInternal(count + length);
        str.getChars(0, length, value, count);
        count += length;

        return this;
    }

    /**
     * 确认value空间是否足够，不够则扩充空间
     *
     * @param minimumCapacity 需要的最低容量
     */
    private void ensureCapacityInternal(int minimumCapacity) {
        if (minimumCapacity > value.length) {
            value = Arrays.copyOf(value, newCapacity(minimumCapacity));
        }
    }

    /**
     * 创建一个新的容量
     * 默认新的容量是 value 长度*2+2，
     * 如果新的容量 < 最低容量，新的容量按照要求的最低容量来
     * 新的容量是否小于允许的最大长度且大于0，true-返回新的容量，否则-返回允许最大容量
     *
     * @param minCapacity 最低容量
     * @return 新的容量
     */
    private int newCapacity(int minCapacity) {
        int newCapacity = (value.length << 1) + 2;
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }

        return (newCapacity > 0 && newCapacity < MAX_ARRAY_SIZE)
                ? newCapacity
                : hugeCapacity(minCapacity);
    }

    /**
     * 创建一个最大的容量
     *
     * @param minCapacity 最低容量
     * @return 最大容量
     */
    private int hugeCapacity(int minCapacity) {
        //溢出
        if (Integer.MAX_VALUE - minCapacity < 0) {
            throw new OutOfMemoryError();
        }

        return (minCapacity > MAX_ARRAY_SIZE)
                ? minCapacity
                : MAX_ARRAY_SIZE;
    }

    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}
