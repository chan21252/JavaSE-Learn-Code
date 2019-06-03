package unit13;

public class SynMethod implements Runnable {

    private double money = 1000000;

    @Override
    public void run() {
        doMoney();
    }

    /**
     * 同步方法
     */
    private synchronized void doMoney() {
        Thread current = Thread.currentThread();
        System.out.println(current.getName() + "正在使用系统");
        for (int i = 1; i <= 10; i++) {
            if (current.getName().equals("会计")) {
                money += i * 10;
            }

            if (current.getName().equals("出纳")) {
                money -= i * 5;
            }

            System.out.println("当前账户余额 " + money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
