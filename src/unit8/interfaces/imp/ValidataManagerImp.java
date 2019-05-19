package unit8.interfaces.imp;

import unit8.interfaces.ValidataManager;

public class ValidataManagerImp implements ValidataManager {
    @Override
    public boolean validateAge(int age) {
        return (age >= MAX_AGE) ? YES : NO;
    }

    @Override
    public boolean validate(String password) {
        return (password.length() >= MIN_LENGTH && password.length() <= MAX_LENGTH);
    }

    @Override
    public double count(double n, double m, char tag) {
        switch (tag) {
            case '+':
                return n + m;
            case '-':
                return n - m;
            case '*':
                return n * m;
            case '/':
                return n / m;
            default:
                return n % m;
        }
    }

    @Override
    public double count(double up, double down, double height) {
        return 0;
    }

    @Override
    public double eqMaxOrMin(double n, double m) {
        return 0;
    }
}
