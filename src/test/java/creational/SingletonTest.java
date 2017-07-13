package creational;

import creational.singleton.Singleton;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/13.
 */
public class SingletonTest {
    @Test
    public void test() {
        Singleton singleton = Singleton.instance();
        System.out.println(singleton.showName());
    }
}
