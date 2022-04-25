package ClockTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    private Clock clock;
    @BeforeEach
    public void startWithThis(){
        clock = new Clock(0,0,0);
    }


    @Test
    public void clockCanBeCreatedTest() {
        assertNotNull(clock);
    }

    @Test
    public void clockHourCanBeCreatedTest(){
        clock.setHour(12);
        assertEquals(12,clock.getHour());
    }
    @Test
    public void clockMinuteCanBeCreatedTest(){
        clock.setMinute(10);
        assertEquals(10,clock.getMinute());
    }
    @Test
    public void clockSecondCanBeCreatedTest(){
        clock.setSecond(2);
        assertEquals(2,clock.getSecond());
    }
    @Test
    public void displayTimeTest(){
        clock.setHour(6);
        clock.setMinute(45);
        clock.setSecond(8);
        assertEquals("6:45:8", clock.displayTime());
    }
    @Test
    public void clockClassConstructorTest(){
        Clock clock = new Clock(0,0,0);

        assertEquals(0,clock.getHour());
        assertEquals(0,clock.getMinute());
        assertEquals(0,clock.getSecond());
    }
}
