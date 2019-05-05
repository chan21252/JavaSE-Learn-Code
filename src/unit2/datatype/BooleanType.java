package unit2.datatype;

public class BooleanType {
    public static void main(String[] args) {
        boolean passed = false;
        System.out.println("考试通过了吗？ " + passed);

        int score = 65;
        passed = score > 60;
        System.out.println("考试通过了吗？ " + passed);
    }
}
