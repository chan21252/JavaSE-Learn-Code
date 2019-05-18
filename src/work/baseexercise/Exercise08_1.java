package work.baseexercise;

/*
 *
 ***
 *****
 *******
 *********

 */
public class Exercise08_1 {
    public static void main(String[] args) {
        /*
        第1行 1* 4空格
        第2行 3* 3空格
        第3行 5* 2空格

        总共N行
        第i行 2*i-1个* N-i个空格
         */

        final int N = 5;
        for (int line = 1; line <= N; line++) {
            for (int space = 1; space <= (N - line); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * line - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
