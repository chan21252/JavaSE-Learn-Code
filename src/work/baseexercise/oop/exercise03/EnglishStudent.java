package work.baseexercise.oop.exercise03;

/**
 * 英文系学生类
 */
public class EnglishStudent extends Student {
    //分数权重常量
    private static final double SPEECH_WEIGHT;
    private static final double MID_TERM_WEIGHT;
    private static final double FINAL_TERM_WEIGHT;

    static {
        SPEECH_WEIGHT = 0.5;
        MID_TERM_WEIGHT = 0.25;
        FINAL_TERM_WEIGHT = 0.25;
    }

    //不同类别的分数
    private int speechScore;
    private int midTermScore;
    private int finalTermScore;

    public EnglishStudent(String id, String name, String gender, int age,
                          int speechScore, int midTermScore, int finalTermScore) {
        super(id, name, gender, age);
        this.speechScore = speechScore;
        this.midTermScore = midTermScore;
        this.finalTermScore = finalTermScore;
    }

    @Override
    public double calculateScore() {
        return speechScore * SPEECH_WEIGHT + midTermScore * MID_TERM_WEIGHT +
                finalTermScore * FINAL_TERM_WEIGHT;
    }

    @Override
    public String toString() {
        return "EnglishStudent{" +
                "speechScore=" + speechScore +
                ", midTermScore=" + midTermScore +
                ", finalTermScore=" + finalTermScore +
                '}';
    }
}
