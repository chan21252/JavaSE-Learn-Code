package unit13;

public class ThreadTeacher extends Thread {
    public ThreadTeacher(Runnable target, String name) {
        super(target, name);
    }

    public void interruptSleep(Thread thread) {
        thread.interrupt();
    }
}
