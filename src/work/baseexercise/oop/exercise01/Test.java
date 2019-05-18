package work.baseexercise.oop.exercise01;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("benz", "black");
        Car car1 = new Car("Honda", "red", 2);

        vehicle1.setSpeed(100);
        car1.setSpeed(80.80);

        vehicle1.run();
        car1.run();
    }
}
