package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sggb on 2017/7/18.
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public FlyweightFactory() {
        flyweightMap.put("A", new ConcreteFlyweight());
        flyweightMap.put("B", new ConcreteFlyweight());
        flyweightMap.put("C", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweightMap.get(key);
    }
}
