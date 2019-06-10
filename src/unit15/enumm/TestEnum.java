package unit15.enumm;

public class TestEnum {
    public static void main(String[] args) {
        //访问常量
        System.out.println(SignalLamp.RED);

        //用索引访问常量
        System.out.println(SignalLamp.values()[1]);

        //比较，大于返回1，小于返回-1，等于返回0
        System.out.println(SignalLamp.YELLOW.compareTo(SignalLamp.GREEN));

        //获取常量名
        System.out.println(SignalLamp.YELLOW.name());

        //获取常量索引
        System.out.println(SignalLamp.YELLOW.ordinal());

        //获取常量数组，并遍历
        for (SignalLamp e : SignalLamp.values()) {
            System.out.println(e.name());
        }
    }
}