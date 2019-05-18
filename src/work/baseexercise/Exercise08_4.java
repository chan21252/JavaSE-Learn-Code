package work.baseexercise;

/*

     *
    *  *
   *    *
  *      *
 *        *
  *      *
   *    *
    *  *
     *

1   4个空格 1个* 0个空格
2   3个空格 1个* 2个空格 1个*
3   2个空格 1个* 4个空格 1个*
4   1个空格 1个* 6个空格 1个*
5   0个空格 1个* 8个空格 1个*

总N行
第i行 N-i个空格 1个* 2*(i-1)个空格 i>1：1个*
*/
public class Exercise08_4 {
    public static void main(String[] args) {
        final int N = 5;

        //上半部
        for (int line = 1; line <= N; line++) {
            for (int space1 = 1; space1 <= (N - line); space1++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int space2 = 1; space2 <= 2 * (line - 1); space2++) {
                System.out.print(" ");
            }

            if (line > 1) {
                System.out.print("*");
            }
            System.out.println();
        }

        //下半部
        for (int line = 1; line <= N - 1; line++) {
            for (int space1 = 1; space1 <= line; space1++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int space2 = 1; space2 <= 2 * (N - line - 1); space2++) {
                System.out.print(" ");
            }

            if (N - line > 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
