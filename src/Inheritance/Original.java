package Inheritance;

public class Original {

    public static void main(String[] args) {


        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Bingo", 3, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
    }
}
