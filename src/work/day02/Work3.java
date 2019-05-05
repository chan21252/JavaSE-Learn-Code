package work.day02;

/**
 * 任务3
 * 根据视频教学编写一个java控制台程序，
 * 使用正确方式定义静态变量或静态常量，存储以下描述的数据并在控制台界面打印这些数据，并书写标准文档，方法，及相关注释：
 * 一年之中季节有几个；
 * 一个星期有几天；
 * 狗的颜色；
 * 存款数量；
 * 交通信号灯数量；
 */
public class Work3 {
    static final byte SEASON_NUM = 4;           //定义byte类型常量，一年有4个季节
    static final byte WEEK_DAY_NUM = 7;         //定义byte类型常量，一周有7天
    static String dogsColor;                    //定义字符串类型变量，狗的颜色可变
    static double moneyNum;                     //定义double类型变量，银行的存款可变
    static final byte TRAFFIC_LIGHT_NUM = 3;    //定义byte类型常量，信号灯有3种

    public static void main(String[] args) {
        dogsColor = "白色";          //为dogscolor变量赋值
        moneyNum = 10000.00;        //为moenyNum变量赋值

        //调用输出方法
        printSeanNum();
        printWeekdayNum();
        printDogColor();
        printMoneyNum();
        printTrafficLightNum();
    }

    public static void printSeanNum(){
        System.out.println("一年的季节有 " + SEASON_NUM + " 个");
    }

    public static void printWeekdayNum(){
        System.out.println("一周有 " + WEEK_DAY_NUM + " 天");
    }

    public static void printDogColor(){
        System.out.println("狗的颜色是 " + dogsColor);
    }

    public static void printMoneyNum() {
        System.out.println("存款数量是 " + moneyNum);
    }

    public static void printTrafficLightNum(){
        System.out.println("交通信号灯的数量是 " + TRAFFIC_LIGHT_NUM + "个");
    }
}
