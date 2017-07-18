package structural;

import org.junit.Test;
import structural.flyweight.Flyweight;
import structural.flyweight.FlyweightFactory;

/**
 * Created by sggb on 2017/7/18.
 */
public class FlyweightTest {
    @Test
    public void test() {

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight a = flyweightFactory.getFlyweight("A");
        Flyweight b = flyweightFactory.getFlyweight("B");
        Flyweight c = flyweightFactory.getFlyweight("C");

        a.operation(1);
        b.operation(2);
        c.operation(3);
    }
}
