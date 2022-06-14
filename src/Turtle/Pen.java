package Turtle;

public class Pen {

    private boolean isDown;
    private boolean up;

    public boolean isDown() {
        return isDown;
    }

    public void moveDown() {
        this.isDown  = true;
    }

    public void moveUp() {
        this.isDown = false;
    }
    public void up() {
       this.isDown = false;
    }

    public void down() {
        this.isDown = true;
    }
}