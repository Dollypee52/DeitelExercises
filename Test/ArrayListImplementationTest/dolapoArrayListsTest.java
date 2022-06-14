package ArrayListImplementationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class dolapoArrayListsTest {
    private dolapoArrayLists arrayList;
    @BeforeEach
    public void setup(){
        arrayList = new dolapoArrayLists();
    }
    @Test
   public void arrayListExistTest(){
        assertNotNull(arrayList);
    }
    @Test
   public void arrayListCanAddItemTest(){
        arrayList.add("ball");
        assertEquals(1, arrayList.size());
    }
    @Test
   public void arrayListCanBeRemovedTest(){
        arrayList.add("ball");
        arrayList.add("game");
        arrayList.remove("game");
        assertEquals(1,arrayList.size());
    }
    @Test
   public void arrayListCanAddAndGetWithIndex(){
        arrayList.add(0, "ball");
        arrayList.add(1, "game");
        arrayList.add(2, "book");
        assertEquals("book", arrayList.get(2));
    }
    @Test
   public void arrayListCanRemovedByIndexAndItemTest(){
        arrayList.add(0, "Book");
        arrayList.add(1, "Blue Book");
        arrayList.add(2, "Brown Biro");
        arrayList.add(3, "Yellow Bag");
        arrayList.remove(2);
        assertEquals(3, arrayList.size());
    }
    @Test
   public void arrayListCanExpandWhenFullTest(){
        arrayList.add(0, "Book");
        arrayList.add(1, "Blue Book");
        arrayList.add(2, "Brown Biro");
        arrayList.add(3, "Yellow Bag");
        arrayList.add(4, "Yellow Bag");
        arrayList.add(5, "Yellow Bag");
        assertEquals(6, arrayList.size());
    }
    @Test
   public void arrayListCanBeRemovedByIndexTest(){
        arrayList.add("GoodMans");
        arrayList.add("Golden Morn");
        arrayList.add("Boiled Egg");
        arrayList.remove(1);
        assertEquals("Boiled Egg", arrayList.get(1));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
    }
}