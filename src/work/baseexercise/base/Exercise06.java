package work.baseexercise.base;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println(getScoreLV(90));
    }

    private static String getScoreLV(int score) {
        final String LEVEL;
        if (score >= 90) {
            LEVEL = "A";
        } else if (score >= 60) {
            LEVEL = "B";
        } else {
            LEVEL = "C";
        }

        return LEVEL;
    }
}
