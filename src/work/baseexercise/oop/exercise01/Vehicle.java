package work.baseexercise.oop.exercise01;

public class Vehicle {
    private final String brand;
    private String color;
    private double speed;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.println(color + " 色的" + brand + " 汽车在行驶， 速度是 " + speed);
    }
}
