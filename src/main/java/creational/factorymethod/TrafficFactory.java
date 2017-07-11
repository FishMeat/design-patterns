package creational.factorymethod;

/**
 * Created by sggb on 2017/7/11.
 */
public abstract class TrafficFactory {

    abstract Traffic newInstance();

    public Traffic getTraffic() {
        return newInstance();
    }
}
