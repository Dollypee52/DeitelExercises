package Chapter5;

import java.util.ArrayList;
import java.util.Collections;

public class StoreElementsOfTypeInteger {
    public static void main(String[] args) {
        ArrayList<Integer> myNUmbers = new ArrayList<Integer>();
        myNUmbers.add(15);
        myNUmbers.add(10);
        myNUmbers.add(25);
        myNUmbers.add(20);
        myNUmbers.add(33);
        myNUmbers.add(8);
        myNUmbers.add(12);
        //sorting arrays of myNumbers
        Collections.sort(myNUmbers);
       // for(int i =0; i< myNUmbers.size(); i++);
       // System.out.println(myNUmbers.get(3));
        for(int i : myNUmbers){
            System.out.println(i);
        }

    }
}
