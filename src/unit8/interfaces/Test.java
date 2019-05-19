package unit8.interfaces;

import unit8.interfaces.imp.ComputerImp;
import unit8.interfaces.imp.ValidataManagerImp;

public class Test {
    public static void main(String[] args) {
        Computer com = new ComputerImp();
        double result = com.count(89, 91, '+');
        System.out.println(result);

        ValidataManager vm = new ValidataManagerImp();
        System.out.println(vm.count(56, 23, '/'));
        System.out.println(vm.validate("123456789"));
    }
}
