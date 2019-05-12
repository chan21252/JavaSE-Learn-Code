package work.baseexercise;

/**
 * 判断101-200之间有多少个素数，并输出所有素数
 */
public class Exercise05 {
    public static void main(String[] args) {
        int count = 0;

        //遍历101-200
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;

            //i是否能被2-根号i整除
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("101-200之间有 " + count + " 个素数");
    }
}
