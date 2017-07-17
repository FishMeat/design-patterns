package structural;

import org.junit.Test;
import structural.facade.Facade;

/**
 * Created by sggb on 2017/7/17.
 */
public class FacadeTest {
    @Test
    public void test() {
        Facade facade = new Facade();
        facade.operation();
    }
}
