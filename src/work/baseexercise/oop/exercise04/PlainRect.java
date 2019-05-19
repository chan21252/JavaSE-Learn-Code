package work.baseexercise.oop.exercise04;

public class PlainRect extends Rect {
    private int startX;
    private int startY;

    public PlainRect(int width, int height, int startX, int startY) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    public PlainRect() {
        super(0, 0);
        this.startX = 0;
        this.startY = 0;
    }

    public boolean isInside(double x, double y) {
        if (x >= startX && x <= (startX + width) && y < startY && y >= (startY - height)) {
            return true;
        } else {
            return false;
        }
    }

}
