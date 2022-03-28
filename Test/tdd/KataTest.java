package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.add(5,6);
        assertEquals(11, result);
    }
    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(5,6);
        assertEquals(1,result);
    }
    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2,6);
        assertEquals(4,result);
    }
    @Test
    public void multiplicationTest(){
        Kata calculator = new Kata();
        int result = calculator.multiply(5,6);
        assertEquals(30,result);
    }
    @Test
    public void divideTest(){
        Kata calculator = new Kata();
        int result = calculator.divide(30,6);
        assertEquals(5,result);
    }
    @Test
    public void areaOfCircle(){
        Kata calculator = new Kata();
        int result = calculator.radius(7);
        assertEquals(154,result);
    }
    @Test
    public void bitFlipper(){
        Kata calculator = new Kata();
        int result = calculator.flip(0);
        assertEquals(1,result);
    }
}
