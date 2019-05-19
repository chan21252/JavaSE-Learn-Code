package unit8.interfaces;

import unit8.interfaces.CountManager;

public interface ValidataManager extends CountManager {
    boolean YES = true;
    boolean NO = false;
    int MAX_AGE = 18;
    int MAX_LENGTH = 16;
    int MIN_LENGTH = 6;

    boolean validateAge(int age);

    boolean validate(String password);
}
