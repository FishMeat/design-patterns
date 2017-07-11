package creational;

import creational.factorymethod.BikeFactory;
import creational.factorymethod.CarFactory;
import creational.factorymethod.TrafficFactory;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/11.
 */
public class FactoryMethodTest {
    @Test
    public void test() {
        TrafficFactory trafficFactory = new CarFactory();
        trafficFactory.getTraffic().showName();
        trafficFactory = new BikeFactory();
        trafficFactory.getTraffic().showName();
    }
}
