package unit8.abstarcts.imp;

public class Dog extends MammalAdapter {
    @Override
    public void run() {
        System.out.println("狗在奔跑");
    }

    @Override
    public void eat() {
        System.out.println("狗在吃饭");
    }

    @Override
    public void lactation() {
        System.out.println("狗在哺乳");
    }
}
