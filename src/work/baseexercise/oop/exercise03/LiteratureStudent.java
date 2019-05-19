package work.baseexercise.oop.exercise03;

/**
 * 文学系学生类
 */
public class LiteratureStudent extends Student {
    private static final double SPEECH_WEIGHT;
    private static final double WORK_WEIGHT;
    private static final double MID_TERM_WEIGHT;
    private static final double FINAL_TERM_WEIGHT;

    static {
        SPEECH_WEIGHT = 0.35;
        WORK_WEIGHT = 0.35;
        MID_TERM_WEIGHT = 0.15;
        FINAL_TERM_WEIGHT = 0.15;
    }

    private int speechScore;
    private int workScore;
    private int midTermScore;
    private int finalTermScore;

    public LiteratureStudent(String id, String name, String gender, int age,
                             int speechScore, int workScore, int midTermScore, int finalTermScore) {
        super(id, name, gender, age);
        this.speechScore = speechScore;
        this.workScore = workScore;
        this.midTermScore = midTermScore;
        this.finalTermScore = finalTermScore;
    }

    @Override
    public double calculateScore() {
        return speechScore * SPEECH_WEIGHT + workScore * WORK_WEIGHT +
                midTermScore * MID_TERM_WEIGHT + finalTermScore * FINAL_TERM_WEIGHT;
    }

    @Override
    public String toString() {
        return "LiteratureStudent{" +
                "speechScore=" + speechScore +
                ", workScore=" + workScore +
                ", midTermScore=" + midTermScore +
                ", finalTermScore=" + finalTermScore +
                '}';
    }
}
