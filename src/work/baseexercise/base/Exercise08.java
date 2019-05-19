package work.baseexercise.base;

/**
 * 打印出如下图案（菱形）
 * *
 * ***
 * ******
 * ********
 * ******
 * ***
 * *
 */
public class Exercise08 {

    public static void main(String[] args) {
        /*
        第4行 0空格 8* 4+4
        第3行 1空格 6* 3+3
        第2行 2空格 3* 2+1
        第1行 3空格 1* 1+0
        ...
        总共n行
        第i行 (n-i)空格 ifi<=2: i+(i/2)个*  i>2 2i个*

        下半部
        第1行 1空格 6*
        第2行 2空格 3*
        第3行 3空格 1*

        第i行 i个空格 if(n-i)<=2: (n-i)+(n-i)/2个* (n-i)>2 (n-i)*2
         */

        final int N = 4;

        //画上半部
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= (N - i); j++) {
                System.out.print(" ");
            }
            if (i <= 2) {
                for (int k = 1; k <= (i + i / 2); k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= 2 * i; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //画下半部
        for (int i = 1; i <= N - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            if ((N - i) <= 2) {
                for (int k = 1; k <= ((N - i) + (N - i) / 2); k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= 2 * (N - i); k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
