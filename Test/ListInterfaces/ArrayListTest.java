package ListInterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {
    @Test
    public void addTest() {
        List list = new ArrayList();
        list.add("Shoe for girlfriend");
        assertEquals(1, list.size());
    }

    @Test
    public void addAndGetTest() {
        List list = new ArrayList();
        list.add("Shoe for girlfriend");
        assertEquals("Shoe for girlfriend", list.get(0));
    }

    @Test
    public void addByIndexTest() {
        List list = new ArrayList();
        list.add("Shoe for girlfriend");
        list.add("Car for birthday");
        list.add("Money for mechanic");
        list.add(1,"Laptop for sister");
        assertEquals("Laptop for sister", list.get(1));
    }

    @Test
    public void removeTest() {
        List list = new ArrayList();
        list.add("Shoe for girlfriend");
        list.add("Car for birthday");
        list.add("Money for mechanic");
        list.remove("Car for birthday");
        assertEquals(2, list.size());
    }

    @Test
    public void addMoreThanArraySizeTest() {
        List list = new ArrayList();
        list.add("Shoe for girlfriend");
        list.add("Car for birthday");
        list.add("Money for mechanic");
        list.add("Laptop for sister");
        list.add("Gift for babe");
        list.add("Money for food");
        assertEquals( 6 , list.size());
    }


}
