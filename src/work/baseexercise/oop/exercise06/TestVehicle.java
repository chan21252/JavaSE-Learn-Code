package work.baseexercise.oop.exercise06;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setSpeed(40);
        vehicle.setSize(100);
        System.out.println("vehicle 的速度是 " + vehicle.getSpeed());
        System.out.println("vehicle 的体积是 " + vehicle.getSize());

        vehicle.speedDown();
        System.out.println("vehicle 的速度是 " + vehicle.getSpeed());

        vehicle.speedUp();
        vehicle.speedUp();
        System.out.println("vehicle 的速度是 " + vehicle.getSpeed());
    }
}
