package work.baseexercise.algorithm;

/**
 * 编写程序解决“百钱买百鸡”问题。
 * 公鸡五钱一只，母鸡三钱一只，小鸡一钱三只，现有百钱欲买百鸡，共有多少种买法？
 */
public class exercise23 {
    public static void main(String[] args) {
        /*
        (1) 5x + 3y + (1/3)z = 100
        (2) x + y + z = 100
        x,y,z都是整数，求方程组的正整数解

        (1)*3 - (2):
          15x + 9y + z = 300
        - x + y+ z = 100
        --------------------------
        14x + 8y = 200 => 7x + 4y = 100

        y = (100 - 7x)/4 = 25 - 7*(1/4)x

        令 x = 4t
           y = 25 - 7t
           z = 100 - 4t - (25 - 7t) = 75 + 3t

        ∵ x,y,z都>=0
        ∴ 4t >= 0, 25-7t >= 0, 75+3t >= 0
        ∴ 0 <= t <= 3

        t=0，x=0, y=25, z=75
        t=1, x=4, y=18, z=78
        t=2, x=8, y=11, z=81
        t=3, x=12, y=4, z=84
         */
        final double COCK_PRICE = 5.0;
        final double HEN_PRICE = 3.0;
        final double CHICK_PRICE = 1.0 / 3.0;   // 1/3的结果是0，1.0/3.0的结果是0.33333....

        int cockNum, henNum, chickNum;

        /*
        公鸡最多20只，母鸡最多33只
        公鸡从0-20
        母鸡从0-33
        小鸡 = 100-公鸡-母鸡
        算价格总和等于100的情况
         */
        cockNum = 0;
        int answerNum = 0;

        //while实现
        while (cockNum <= 20) {
            henNum = 0;
            while (henNum <= 33) {
                chickNum = 100 - cockNum - henNum;
                if (cockNum * COCK_PRICE + henNum * HEN_PRICE + chickNum * CHICK_PRICE == 100.0) {
                    System.out.println("解" + (++answerNum) + ":");
                    System.out.println("公鸡 " + cockNum + " 只,母鸡 " + henNum + " 只,小鸡 " + chickNum + " 只");
                }
                henNum++;
            }
            cockNum++;
        }

        //for实现
        //to-do
    }
}
