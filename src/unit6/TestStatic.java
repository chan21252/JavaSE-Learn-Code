package unit6;

import unit6.entity.Computer;

public class TestStatic {
    public static void main(String[] args) {
        double r = 23.50;
        double area = Computer.countCircle(r);
        System.out.println("半径是 " + r + " 的圆的面积是 " + area);
    }
}
