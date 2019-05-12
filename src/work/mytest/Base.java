package work.mytest;

public class Base {
    public static void main(String[] a) {
        new Base().test();
    }

    private void test() {
        String aStr = "? One? ";
        String bStr = aStr;
        aStr = aStr.toUpperCase();
        aStr = aStr.trim();
        System.out.println("[" + aStr + "," + bStr + "]");
    }
}

