package unit6.entity;


public class Computer {

    /**
     * 计算num2和num3的和
     *
     * @param num2
     * @param num3
     */
    public void countSum(int num2, int num3){
        System.out.println(num2+ " + " +num3+ " = " + (num2+num3));
        num2 = 100;
        num3 = 200;
    }

    /**
     * 计算梯形的面积
     *
     * @param up   上底
     * @param down 下底
     * @param h    高
     * @return 返回梯形面积
     */
    public double countTrapezoidArea(double up, double down, double h) {
        return (up + down) * h / 2;
    }

    public double count(double n, double m, int tag) {
        return 0;
    }
}
