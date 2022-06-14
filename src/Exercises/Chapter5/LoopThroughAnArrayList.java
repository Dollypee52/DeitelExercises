package Exercises.Chapter5;

import java.util.ArrayList;
import java.util.Collections;

public class LoopThroughAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(1, "Benz");
        //sorting arrays of myNumbers
        Collections.sort(cars);
    //   cars.remove(2);
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
