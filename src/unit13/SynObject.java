package unit13;

public class SynObject implements Runnable {
    private Dog dog;

    public SynObject() {
        if (dog == null) {
            dog = new Dog();
        }
    }

    @Override
    public void run() {
        synchronized (dog) {
            Thread current = Thread.currentThread();
            for (int i = 0; i < 10; i++) {
                System.out.println(current.getName() + "正在修改dog的名字");
                dog.setName("卡尔");
                System.out.println(dog.getName() + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
