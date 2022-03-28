package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test

    public void switchOnTest() {
        //given
        AirConditioner dolapoAirconditioner = new AirConditioner();
        //when
        dolapoAirconditioner.setSwitch("on");
        //assert
        assertEquals(true, dolapoAirconditioner.getOnOff());
    }


    @Test
    public void switchOffTest() {
        //given
        AirConditioner dolapoAirconditioner = new AirConditioner();
        //when
        dolapoAirconditioner.setSwitch("off");
        //assert
        assertEquals(false, dolapoAirconditioner.getOnOff());
    }

    @Test

    public void increaseTemperature() {
        //given
        AirConditioner dolapoAirconditioner = new AirConditioner();
        //when
        dolapoAirconditioner.increaseTemperature();
        //assert
        assertEquals(1, dolapoAirconditioner.getTemperature());

    }

    @Test
    public void decreaseTemperature() {
        //given
        AirConditioner dolapoAirconditioner = new AirConditioner();
        //when
        dolapoAirconditioner.decreaseTemperature();
        //assert
        assertEquals(-1, dolapoAirconditioner.getTemperature());
    }

    @Test
    public void decreaseTemperatureBelow16() {
        //given
        AirConditioner dolapoAirconditioner = new AirConditioner();
        //when
        dolapoAirconditioner.setTemperature(20);
        dolapoAirconditioner.decreaseTemperature();
        //assert
        assertEquals(19, dolapoAirconditioner.getTemperature());
    }

    @Test
    public void increaseTemperaturebeyond30() {
        //given
        AirConditioner dolapoAirconditioner = new AirConditioner();
        //when
        dolapoAirconditioner.setTemperature(79);
        dolapoAirconditioner.increaseTemperature();
        //assert
        assertEquals(30, dolapoAirconditioner.getTemperature());
    }
}



