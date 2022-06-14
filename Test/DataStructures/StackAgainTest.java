package DataStructures;

import DataStructure.StackAgain;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackAgainTest {
    private StackAgain stackAgain;

    @BeforeEach
    public void setUp(){
        stackAgain = new StackAgain();
    }
    @Test
    public void testThatStackExists(){
        assertNotNull(stackAgain);
    }

    @Test
    public void testThatStackIsEmpty(){
        assertTrue(stackAgain.isEmpty());
    }

    @Test
    public void testThatStackIsNotEmptyWhenElementOIsPushed(){
        stackAgain.push("first element");
        assertFalse(stackAgain.isEmpty());
    }

    @Test
    public void testThatElementsPushedInStackCanBePeeked(){
        stackAgain.push("firstElement");
        String result = stackAgain.peek();
        assertEquals("firstElement", result);
    }

    @Test
    public void testThatMultipleElementsCanBePushedInStack(){
        stackAgain.push("firstElement");
        stackAgain.push("Element");
        stackAgain.push("first");
        String result = stackAgain.peek();
        assertEquals("first", result);
        String result2 = stackAgain.peek(1);
        assertEquals("Element", result2);
    }
    @Test
    public void testThatElementPushedInCanBePopped(){
        stackAgain.push("firstElement");
        stackAgain.pop();
        assertTrue(stackAgain.isEmpty());


    }
    @Test
    public void testThatMultipleElementCanBePushedAndPopped(){
        stackAgain.push("firstElement");
        stackAgain.push("Element");
        stackAgain.push("first");
        String result = stackAgain.pop();
        assertEquals("first", result);
        assertEquals("Element", stackAgain.peek());
        result = stackAgain.pop();
        assertEquals("firstElement",stackAgain.peek());

    }
}
