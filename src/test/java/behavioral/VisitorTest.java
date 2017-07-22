package behavioral;

import behavioral.visitor.*;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/6.
 */
public class VisitorTest {
    @Test
    public void test() {
        Product productA = new ProductA(12);
        Product productB = new ProductB(21);

        Visitor visitor1 = new ProductAVisitor();
        Visitor visitor2 = new ProductBVisitor();

        productA.accept(visitor1);
        productA.accept(visitor2);

        productB.accept(visitor1);
        productB.accept(visitor2);

    }
}
