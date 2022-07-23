package ArrayListImplementationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MySetTest {
    private MySet setters;
    @BeforeEach
    public void setUp(){
        setters = new MySet();
    }
    @Test
    public void setCanBeCreatedTest(){
        assertNotNull(setters);

    }
    @Test public void setIsEmptyTest(){
       setters.isEmpty();
       assertEquals(true,setters.isEmpty());

    }
}
