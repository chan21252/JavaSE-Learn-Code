package unit13;

public class ThreadStudent extends Thread {
    public ThreadStudent(Runnable target, String name) {
        super(target, name);
    }
}
