package work.baseexercise.oop.exercise03;

/**
 * 计算机系学生类
 */
public class ComputerStudent extends Student {

    private static final double OPERATE_WEIGHT;
    private static final double EN_WRITING_WEIGHT;
    private static final double MID_TERM_WEIGHT;
    private static final double FINAL_TERM_WEIGHT;

    static {
        OPERATE_WEIGHT = 0.4;
        EN_WRITING_WEIGHT = 0.2;
        MID_TERM_WEIGHT = 0.2;
        FINAL_TERM_WEIGHT = 0.2;
    }

    private int operateScore;
    private int ENWritingScore;
    private int midTermScore;
    private int finalTermScore;

    public ComputerStudent(String id, String name, String gender, int age,
                           int operateScore, int ENWritingScore, int midTermScore, int finalTermScore) {
        super(id, name, gender, age);
        this.operateScore = operateScore;
        this.ENWritingScore = ENWritingScore;
        this.midTermScore = midTermScore;
        this.finalTermScore = finalTermScore;
    }

    @Override
    public double calculateScore() {
        return operateScore * OPERATE_WEIGHT + ENWritingScore * EN_WRITING_WEIGHT +
                midTermScore * MID_TERM_WEIGHT + finalTermScore * FINAL_TERM_WEIGHT;
    }

    @Override
    public String toString() {
        return "ComputerStudent{" +
                "operateScore=" + operateScore +
                ", ENWritingScore=" + ENWritingScore +
                ", midTermScore=" + midTermScore +
                ", finalTermScore=" + finalTermScore +
                '}';
    }
}
