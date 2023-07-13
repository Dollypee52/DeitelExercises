//package Car;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CarTest {
//    private Car car;
//    @BeforeEach
//
//    public void setUp(){
//        car = new Car("Mazda", "2092", 46590.80);
//    }
//
//    @Test
//    public void carCanBeCreatedTest(){
//
//        assertNotNull(car);
//
//    }
//
//    @Test
//    public void carModelCanBeSetTest(){
//
//        car.setCarModel("Mazda");
//        assertEquals("Mazda", car.getCarModel());
//
//    }
//    @Test
//    public void carYearIsSetTest(){
//
//        car.setCarYear("1995");
//        assertEquals("1995",car.getCarYear());
//    }
//    @Test
//    public void carPriceCanBeSetTest(){
//
//        car.setCarPrice(5000.00);
//        assertEquals(5000.00,car.getCarPrice());
//    }
//    @Test
//    public void carClassConstructorCanBeSetTest(){
//        Car car1 = new Car("Mazda","2092",4590.80);
//        Car car2 = new Car("Toyota","2012",-20.9);
//        assertEquals(4590.80, car1.getCarPrice());
//        car1.setCarPrice(-500);
//        assertEquals(4590.80, car1.getCarPrice());
//        assertEquals(0, car2.getCarPrice());
//
//    }
//   @Test
//   public void carDiscountPriceTest(){
//       Car car1 = new Car("Mazda","2092",4590.80);
//       car1.setDiscount(0.05);
//       assertEquals(4361.26,car1.getCarPrice());
//
//       Car car2 = new Car("Ferrari","2032",21000);
//       car2.setDiscount(0.07);
//       assertEquals(19530.0,car2.getCarPrice());
//
//
//
//   }
//
//
//
//}
