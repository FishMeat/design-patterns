package behavioral;

import behavioral.responsibility.ConcreteHandlerA;
import behavioral.responsibility.ConcreteHandlerB;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/22.
 */
public class ResponsibilityTest {
    @Test
    public void test() {
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB(null);
        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA(concreteHandlerB);

        concreteHandlerA.handleRequest("A");
        concreteHandlerA.handleRequest("B");
        concreteHandlerA.handleRequest("C");
    }
}
