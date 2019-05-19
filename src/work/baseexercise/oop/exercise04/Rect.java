package work.baseexercise.oop.exercise04;

public class Rect {
    protected int width;
    protected int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rect() {
        this.width = 10;
        this.height = 10;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * (width + height);
    }
}
