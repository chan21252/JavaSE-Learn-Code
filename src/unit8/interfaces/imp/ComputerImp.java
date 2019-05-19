package unit8.interfaces.imp;

import unit8.interfaces.Computer;

public class ComputerImp implements Computer {
    @Override
    public double count(int num, int num2, char tag) {
        if (tag == 43) {
            return num + num2;
        } else {
            return 0;
        }
    }
}
