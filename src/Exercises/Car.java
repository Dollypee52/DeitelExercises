package Exercises;

public class Car implements Imovable{
    @Override
    public void startMovement() {
        System.out.println("Starts with gear 1");

    }

    @Override
    public void stopMovement() {
        System.out.println("Apply brake");
    }

    @Override
    public void getEnergy() {
        System.out.println("Buy fuel");

    }
}
