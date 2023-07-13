package Andela.OOP.Inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog de normally chew food");
    }

    @Override
    public void eat() {
        System.out.println("Dog is about to override animal eat method");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk()");
        super.move(5);

    }
    public void run(){
        System.out.println("Dog.run()");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs()");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move()");
        moveLegs(speed);
        super.move(speed);
    }
}
