package Andela.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,1,56,87);

        Dog dog = new Dog("Lucky",1,1,32,45,2,4,1,22,"silky coat");
        dog.eat();
        dog.move(12);
        dog.run();
    }
}
