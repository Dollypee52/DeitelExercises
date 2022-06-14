package DataStructures;

import DataStructure.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;
    @BeforeEach
    public void setup(){
        set = new Set();
    }
    @Test
    void SetsIsNotNullTest(){
        assertNotNull(set);
    }
    @Test
    void setCanAddItemTest(){
        set.add("2");
        set.add("3");
        set.add("4");
        assertEquals(3, set.size());
    }
    @Test
    void setCanAddItemByIndexAndItemTest(){
        set.add(0, "3");
        set.add(1, "5");
        assertEquals("5", set.get(1));
    }
    @Test
    void setCanRemoveItemTest(){
        set.add("10");
        set.add("24");
        set.add("15");
        set.remove("15");
        assertEquals(2, set.size());
    }
    @Test
    void setCanRemoveItemByIndexTest(){
        set.add(0, "12");
        set.add(1, "10");
        set.add(2, "15");
        set.add(3, "24");
        set.remove(2);
        assertEquals(3, set.size());
        assertEquals("24", set.get(2));

    }
    @Test
    void setIsEmptyTest(){
        set.isEmpty();
        assertEquals(true, set.isEmpty());
    }
    @Test
    void setIsNotEmptyWhenItemsAreAdded(){
        set.add("12");
        assertFalse(set.isEmpty());
    }
    @Test
    void setContainsAnItemTest(){
        set.add("2");
        assertTrue(set.isContain("2"));
    }
    @Test
    void setCannotAddDuplicateValue(){
        set.add("2");
        set.add("24");
        set.add("24");
        assertEquals(2, set.size());
    }
}