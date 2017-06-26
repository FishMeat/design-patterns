package abstractfactory;

/**
 * Created by sggb on 2017/6/26.
 */
public class ConcreteFactory1 implements TrafficFactory {
    @Override
    public Car createCar() {
        return new Car1();
    }

    @Override
    public Bike createBike() {
        return new Bike1();
    }
}
