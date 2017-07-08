package creational.abstractfactory;

/**
 * Created by sggb on 2017/6/26.
 */
public class ConcreteFactory2 implements TrafficFactory {

    @Override
    public Car createCar() {
        return new Car2();
    }

    @Override
    public Bike createBike() {
        return new Bike2();
    }
}
