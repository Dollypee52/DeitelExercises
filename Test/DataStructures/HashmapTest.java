package DataStructures;

import DataStructure.Hashmap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashmapTest {
    private Hashmap map;
    @BeforeEach
    public void setUp(){
        map = new Hashmap();
    }
    @Test
    public  void mapCanBeCreatedTest(){
        assertNotNull(map);
    }
    @Test
    public void DataKeyAndValueCanBeAddedTest(){
        map.put("name","wale");
        assertEquals(1,map.size());
    }
    @Test
    public void MultipleDataCanBeAddedTest(){
        map.put("name","wale");
        map.put("age","30");
        map.put("school","semicolon");
        assertEquals(3,map.size());
    }
    @Test
    public void keyCanFindValueTest(){
        map.put("name","wale");
        map.put("age","30");
        map.put("school","semicolon");
        String value = map.getValue("name");
        assertEquals("wale",value);
    }

    @Test
    public void addingExistingKeyCanUpdateOnlyValueTest(){
        map.put("name","wale");
        map.put("age","30");
        map.put("age","25");
        String value = map.getValue("age");
        assertEquals("25",value);
    }

    @Test
    public void testThatKeyExists(){
        map.put("name","wale");
        map.put("age","30");
        boolean key = map.containKey("age");
        assertTrue(key);
    }

    @Test
    public void testThatValueExists(){
        map.put("name","wale");
        map.put("age","30");
        boolean value = map.containValue("wale");
        assertTrue(value);
    }

}

