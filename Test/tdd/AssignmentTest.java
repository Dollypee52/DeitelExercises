package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentTest {
    @Test

    public void minutesToDay(){
        //given
        Minute input = new Minute();
        //when
        int day = input.years(1000000000);
        //assert
        assertEquals(1902,day );
    }
}
