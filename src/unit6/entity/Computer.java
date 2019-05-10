package unit6.entity;

/**
 * 计算num2和num3的和
 * @param num2
 * @param num3
 */
public class Computer {

    public void countSum(int num2, int num3){
        System.out.println(num2+ " + " +num3+ " = " + (num2+num3));
        num2 = 100;
        num3 = 200;
    }
}
