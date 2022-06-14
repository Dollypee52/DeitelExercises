package AssignmentTest.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test

    public void bikePowerTestOn() {
        //given
        Bike dolapoBike = new Bike();
        //when
        dolapoBike.setBikePower("on");
        //assert
        assertEquals(true, dolapoBike.getBikePower());


    }

    @Test
    public void bikePowerTestOff() {
        //given
        Bike dolapoBike = new Bike();
        //when
        dolapoBike.setBikePower("off");
        //assert
        assertEquals(false, dolapoBike.getBikePower());
    }

    @Test
    public void bikeAccelerationTest1() {
        //given
        Bike dolapoBike = new Bike();
        //when
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        //assert
        assertEquals(18, dolapoBike.getSpeed());

    }

    @Test
    public void bikeAccelerationTest2() {
        //given
        Bike dolapoBike = new Bike();
        //when
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed2();
        //assert
        assertEquals(22, dolapoBike.getSpeed());
    }
    @Test
    public void bikeAccelerationTest3() {
        //given
        Bike dolapoBike = new Bike();
        //when
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed3();
        dolapoBike.Speed3();

        //assert
        assertEquals(48, dolapoBike.getSpeed());
    }
    @Test
    public void bikeAccelerationTest4() {
        //given
        Bike dolapoBike = new Bike();
        //when
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed1();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed2();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed3();
        dolapoBike.Speed4();

        //assert
        assertEquals(76, dolapoBike.getSpeed());
    }
@Test
    public void bikeDeccellerationTest1(){
        //given
    Bike dolapoBike = new Bike();
    //when
    dolapoBike.limitSpeed4();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    //assert
    assertEquals(-74,dolapoBike.getLimitSpeed());
}
@Test
   public void bikeDeccellerationTest2(){
    //given
    Bike dolapoBike = new Bike();
    //when
    dolapoBike.limitSpeed3();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed2();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    dolapoBike.limitSpeed1();
    //assert
    assertEquals(-43,dolapoBike.getLimitSpeed());
}
}


