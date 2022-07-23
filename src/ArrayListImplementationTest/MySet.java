package ArrayListImplementationTest;

import DataStructure.Arraylist;

public class MySet {
    private Arraylist setters = new Arraylist();



    public boolean isEmpty() {
        if(setters.size()>0){
            return false;
        }
        return true;

    }
}
