package unit6;

import unit6.entity.Computer;

public class TestArgs {
    public static void main(String[] args) {
        Computer computer = new Computer();
        int m = 50;
        int n = 55;
        computer.countSum(m, n);
        System.out.println(m);
        System.out.println(n);
    }
}
