package unit13;

public class TestSyn {
    public static void main(String[] args) {
        /*SynCode sync = new SynCode();
        Thread thread1 = new Thread(sync, "线程1");
        Thread thread2 = new Thread(sync, "线程2");
        Thread thread3 = new Thread(sync, "线程3");

        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();*/

        /* 测试同步对象锁 */
        /*SynObject synObj = new SynObject();
        Thread thread4 = new Thread(synObj, "线程4");
        Thread thread5 = new Thread(synObj, "线程5");
        Thread thread6 = new Thread(synObj, "线程6");

        thread4.start();
        thread5.start();
        thread6.start();*/

        /* 测试同步方法锁 */
        SynMethod synMethod = new SynMethod();
        Thread thread7 = new Thread(synMethod, "会计");
        Thread thread8 = new Thread(synMethod, "出纳");

        thread7.start();
        thread8.start();
    }
}
