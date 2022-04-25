package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    public Kata calculator;
    @BeforeEach
    public void startWithThis(){
        calculator = new Kata();
    }
    @Test
    public void additionTest(){
        int result = calculator.add(5,6);
        assertEquals(11, result);
    }
    @Test
    public void subtractionTest(){
        int result = calculator.subtract(5,6);
        assertEquals(1,result);
    }
    @Test
    public void absoluteSubtractionTest(){
        int result = calculator.subtract(2,6);
        assertEquals(4,result);
    }
    @Test
    public void multiplicationTest(){
        int result = calculator.multiply(5,6);
        assertEquals(30,result);
    }
    @Test
    public void divideTest(){
        int result = calculator.divide(30,6);
        assertEquals(5,result);
    }
    @Test
    public void areaOfCircle(){
        int result = calculator.radius(7);
        assertEquals(154,result);
    }
    @Test
    public void bitFlipper(){
        int result = calculator.flip(0);
        assertEquals(1,result);
    }
   @Test
   public void maximumNumberInArrayTest(){
        int [] scores ={34,23,14,45,23,76,93};
        assertEquals(93, Kata.findMaximumFrom(scores));
   }
   @Test
    public void minimumNumberInArray(){
        int [] scores = {34,23,14,45,23,76,93};
 //       assertEquals(14, Kata.findMinimumFrom(scores));
   }
}
