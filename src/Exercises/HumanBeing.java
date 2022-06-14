package Exercises;

public class HumanBeing implements Imovable{
    @Override
    public void startMovement() {
        System.out.println("Use your leg!");
    }

    @Override
    public void stopMovement() {
        System.out.println("Stop walking");
    }

    @Override
    public void getEnergy() {
        System.out.println("Eat food and drink water");
    }
}
