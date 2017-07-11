package creational.factorymethod;

/**
 * Created by sggb on 2017/7/11.
 */
public class CarFactory extends TrafficFactory {
    @Override
    Traffic newInstance() {
        return new Car();
    }
}
