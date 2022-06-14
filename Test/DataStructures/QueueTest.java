package DataStructures;

import DataStructure.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue();

    }

    @Test
    public void thatQueueCanBeCreated() {
        assertNotNull(queue);
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertTrue(queue.isEmpty());

    }

    @Test
    public void testThatQueueIsNotEmptyWhenElementIsPushed() {
        queue.Push("bag");
        queue.Push("lace");
        assertEquals(2, queue.getNoOfitem());
    }

    @Test
    public void testThatElementsPushedInQueueCanBePeeked() {
        queue.Push("bag");
        String result = queue.peek();
        assertEquals("bag", result);
    }

    @Test
    public void testThatElementPushedInCanBePopped() {
        queue.Push("bag");
        queue.Push("shoe");
        queue.Push("lace");
        String result = queue.pop();
        assertEquals("bag", result);
    }
}
