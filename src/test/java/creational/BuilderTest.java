package creational;

import creational.builder.*;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/8.
 */
public class BuilderTest {
    @Test
    public void test() {
        Traffic traffic = new Traffic();
        Car car = traffic.createTraffic(new CarBuilder());
        Bike bike = traffic.createTraffic(new BikeBuilder());

        System.out.println(car.getName());
        System.out.println(car.getColorName());

        System.out.println(bike.getName());
        System.out.println(bike.getColorName());
    }
}
