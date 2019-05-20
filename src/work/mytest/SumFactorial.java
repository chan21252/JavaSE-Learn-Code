package work.mytest;

/**
 * 计算1！+2！+3！+...+n!
 */
public class SumFactorial {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += factorial2(i);
        }

        System.out.println(sum);
    }

    private static int factorial(int n) {
        //n! = n*(n-1)*...*2*1
        if (n < 0) {
            throw new RuntimeException("n不能小于0");
        }
        int p = n;
        while (n > 1) {
            p = p * (--n);
        }
        return p;
    }

    private static int factorial2(int n) {
        if (n < 0) {
            throw new RuntimeException("n不能小于0");
        }

        if (n == 1) {
            return 1;
        } else {
            return n * factorial2(n - 1);
        }
    }
}
