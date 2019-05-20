package work.baseexercise.oop.exercise06;

public class Vehicle {
    private double speed;
    private double size;

    public void move() {
        System.out.println("移动");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void speedUp() {
        speed += 10;
    }

    public void speedDown() {
        speed -= 10;
    }
}
