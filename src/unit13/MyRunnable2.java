package unit13;

/**
 * 利用2个Tread线程实现对1-100的累加计算
 */
public class MyRunnable2 implements Runnable {

    private int sum = 0;    //累加和
    private int i = 1;  //循环变量

    @Override
    public void run() {
        String thName = Thread.currentThread().getName();
        System.out.println(thName + " 正在计算");

        while (i <= 100) {
            sum += i++;
            //第一个线程计算到1-49的和
            if (i == 50) {
                break;
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sum);
    }
}
