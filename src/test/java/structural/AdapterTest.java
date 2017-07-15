package structural;

import org.junit.Test;
import structural.adapter.Adaptee;
import structural.adapter.Adapter;
import structural.adapter.Target;

/**
 * Created by sggb on 2017/7/15.
 */
public class AdapterTest {
    @Test
    public void test() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
