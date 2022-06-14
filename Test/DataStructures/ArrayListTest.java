package DataStructures;

import DataStructure.Arraylist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArrayListTest {
    private Arraylist arraylist;
    @BeforeEach
    public void setUp(){
        arraylist = new Arraylist();
    }
    @Test
    public void arrayListExistedAndNotVoidTEst(){
        assertNotNull(arraylist);


    }
    @Test
    void arrayListCanBeRemovedTest(){
        arraylist.add("Books");
        arraylist.add("Biro");
        arraylist.remove("Biro");
        assertEquals(1,arraylist.size());
    }
    @Test
    void arrayListCanBeAddedAndGottenWithIndex(){
        arraylist.add(0, "Book");
        arraylist.add(1, "Blue biro");
        arraylist.add(2, "Yellow Bag");
        assertEquals("Blue biro", arraylist.get(1));
    }
    @Test
    void arrayListCanBeRemovedByIndexAndItemTest(){
        arraylist.add(0, "Book");
        arraylist.add(1, "Blue Book");
        arraylist.add(2, "Brown Biro");
        arraylist.add(3, "Yellow Bag");
        arraylist.remove(2);
        assertEquals(3, arraylist.size());
    }
    @Test
    void arrayListCanBeExpandedWhenFullTest(){
        arraylist.add(0, "Book");
        arraylist.add(1, "Blue Book");
        arraylist.add(2, "Brown Biro");
        arraylist.add(3, "Yellow Bag");
        arraylist.add(4, "Yellow Bag");
        arraylist.add(5, "Yellow Bag");
        assertEquals(6, arraylist.size());
    }
    @Test
    void arrayListCanBeRemovedByIndexTest(){
        arraylist.add("GoodMans");
        arraylist.add("Golden Morn");
        arraylist.add("Boiled Egg");
        arraylist.remove(1);
        assertEquals("Boiled Egg", arraylist.get(1));

    }
}
