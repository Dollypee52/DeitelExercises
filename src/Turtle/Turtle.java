package Turtle;


import static Turtle.Direction.*;

public class Turtle {
    Pen biro = new Pen();
    private Position currentPosition = new Position(0, 0);
    private Direction currentDirection = EAST;

    public Turtle() {
    }

    public boolean isPenDown() {
        return biro.isDown();
    }

    public void penDown() {
        biro.down();
    }

    public void penUp() {
        biro.up();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == EAST) {
            currentDirection = SOUTH;
        } else if (currentDirection == SOUTH) {
            currentDirection = WEST;
        } else if (currentDirection == WEST) {
            currentDirection = NORTH;
        } else currentDirection = EAST;
    }

    public void turnLeft() {
        if (currentDirection == EAST) {
            currentDirection = NORTH;
        } else if (currentDirection == NORTH) {
            currentDirection = WEST;
        } else if (currentDirection == WEST) {
            currentDirection = SOUTH;
        } else currentDirection = EAST;
    }

    public void move(int steps) {
        if (currentDirection == EAST) {
            increaseColumnBy(steps);
        } else if (currentDirection == SOUTH) {
            increaseRowBy(steps);
        } else if (currentDirection == WEST) {
            decreaseRowBy(steps);
        } else if (currentDirection == NORTH) {
            decreaseColumnBy(steps);
        }
    }

    private void decreaseColumnBy(int steps) {
        currentPosition.setColumn(currentPosition.getColumn());
    }

    private void decreaseRowBy(int steps) {
        currentPosition.setRow(currentPosition.getRow() - (steps - 1));
    }

    private void increaseRowBy(int steps) {
        currentPosition.setRow(currentPosition.getRow() + (steps - 1));
    }

    private void increaseColumnBy(int steps) {
        currentPosition.setColumn(currentPosition.getColumn() + (steps - 1));
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}



//public class Turtle {
//    private Pen pen = new Pen();
//
//
//    public boolean isDown() {
//        return pen.isDown();
//    }
//
//    public void penDown() {
//        pen.moveDown();
//    }
//
//    public void penUp() {
//        pen.moveUp();
//    }
//}
