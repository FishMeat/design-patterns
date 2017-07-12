package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sggb on 2017/7/12.
 */
public class Factory {
    private Map<String, Person> prototypeMap = new HashMap<>();

    public Factory() {
        prototypeMap.put("tom", new Tom());
        prototypeMap.put("cat", new Cat());
    }

    public Person newInstance(String type) {
        return prototypeMap.get(type).clone();
    }
}
