package Exercises.Chapter5;

import java.util.ArrayList;

public class AddItems {
    //add items
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // to change an item, use set() method and refer to the index number
        cars.set(1, "benz");
        // to remove an item, use remove() method and refer to index number
        cars.remove(0);
        //to remove all elements in the ArrayList, use the clear() method
       // cars.clear();

        //to find out how many elements an arraylist have,use the size() method
        cars.size();

        System.out.println(cars);
        // to access an item, use get() method and refer to the index number
        System.out.println(cars.get(0));



    }

}
