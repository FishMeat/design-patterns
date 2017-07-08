import creational.abstractfactory.*;
import org.junit.Test;

/**
 * Created by sggb on 2017/6/26.
 */
public class AbstractFactoryTest {

    @Test
    public void test() {
        TrafficFactory factory = new ConcreteFactory1();
        Car car = factory.createCar();
        Bike bike = factory.createBike();
        System.out.println(car.show());
        System.out.println(bike.show());

        factory = new ConcreteFactory2();
        car = factory.createCar();
        bike = factory.createBike();
        System.out.println(car.show());
        System.out.println(bike.show());
    }
}
