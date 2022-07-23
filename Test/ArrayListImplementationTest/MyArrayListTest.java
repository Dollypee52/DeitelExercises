package ArrayListImplementationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MyArrayListTest{
    private MyArrayList arrayList;

    @BeforeEach
    public void setUp(){
        arrayList = new MyArrayList();
    }

    @Test
      public void arrayListCanBeCreated(){
        MyArrayList arraylist = new MyArrayList();
        assertNotNull(arraylist);
    }
    @Test public void arrayListCanAddTest(){
        arrayList.add("bag");
        arrayList.add("cup");
        arrayList.add("shoe");
        assertEquals(3,arrayList.size());
    }
    @Test public void arrayListCanBeAddedByIndexTest(){
        arrayList.add("bag");
        arrayList.add("cup");
        arrayList.add("shoe");
        assertEquals("cup",arrayList.get(1));

    }
    @Test public void arrayListCanBeRemoveTest(){
        arrayList.add("bag");
        arrayList.add("cup");
        arrayList.add("shoe");
        arrayList.remove("cup");
        assertEquals(2, arrayList.size());
    }
    @Test public void arrayListCanExpandWhenFullTest(){
        arrayList.add("bag");
        arrayList.add("cup");
        arrayList.add("shoe");
        arrayList.add("charger");
        arrayList.add("ball");
        arrayList.add("pen");
        arrayList.add("biro");
        assertEquals(7, arrayList.size());
    }
}