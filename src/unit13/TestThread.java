package unit13;

public class TestThread {
    public static void main(String[] args) {
        ThreadOne one = new ThreadOne();
        ThreadTwo two = new ThreadTwo();
        one.setName("线程一");
        two.setName("线程二");
        //设置线程优先级
        one.setPriority(Thread.MAX_PRIORITY);
        two.setPriority(Thread.MIN_PRIORITY);

        one.start();
        two.start();
        System.out.println("main方法");
    }
}
