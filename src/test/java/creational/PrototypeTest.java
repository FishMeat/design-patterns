package creational;

import creational.prototype.Factory;
import creational.prototype.Person;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/12.
 */
public class PrototypeTest {
    @Test
    public void test() {
        Factory factory = new Factory();
        Person tom = factory.newInstance("tom");
        Person cat = factory.newInstance("cat");

        System.out.println(tom.toString());
        System.out.println(cat.toString());
    }
}
