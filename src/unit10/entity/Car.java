package unit10.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
    private String brand;
    private Date productDate;
    private int power;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", productDate=" + new SimpleDateFormat("yyyy-MM-dd").format(productDate) +
                ", power=" + power +
                ", speed=" + speed +
                '}';
    }
}
