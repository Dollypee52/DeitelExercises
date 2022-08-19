package Composition;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,"Yellow");
        Bed bed = new Bed("moderate",4,12,67,1);
        Lamp lamp = new Lamp("Classic", false,75);

        Bedroom bedroom = new Bedroom("Dolapo","wall1","wall2","wall3","wall4",ceiling,bed,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
