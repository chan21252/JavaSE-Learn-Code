package work.baseexercise.oop.exercise01;

public class Car extends Vehicle {

    private int loader;

    public Car(String brand, String color, int loader) {
        super(brand, color);

        this.loader = loader;
    }

    @Override
    public void run() {
        System.out.println(this.getColor() + " 色的" + super.getBrand() + " 轿车在行驶， 速度是 " + super.getSpeed());
    }
}
