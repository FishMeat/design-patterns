package structural;

import org.junit.Test;
import structural.proxy.Proxy;
import structural.proxy.Subject;

/**
 * Created by sggb on 2017/7/20.
 */
public class ProxyTest {
    @Test
    public void test() {
        Subject a = new Proxy("A");
        Subject b = new Proxy("B");

        System.out.println(a.showName());
        System.out.println(b.showName());
    }
}
