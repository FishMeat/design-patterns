package behavioral;

import behavioral.strategy.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author sggb
 * @since 2017/6/22
 */
public class StrategyTest {

    private static final double DELTA = 1e-15;

    @Test
    public void test() {
        // 加法
        AddStrategy add = new AddStrategy();
        OperationContext<OperationStrategy> addContext = new OperationContext<>(add);
        Assert.assertEquals(3, addContext.compute(1, 2), DELTA);
        // 减法
        SubStrategy sub = new SubStrategy();
        OperationContext<SubStrategy> subContext = new OperationContext<>(sub);
        Assert.assertEquals(5, subContext.compute(10, 5), DELTA);
        // 乘法
        MultiStrategy multi = new MultiStrategy();
        OperationContext<MultiStrategy> mutilContext = new OperationContext<>(multi);
        Assert.assertEquals(18, mutilContext.compute(3, 6), DELTA);
        // 除法
        DivStrategy div = new DivStrategy();
        OperationContext<DivStrategy> divContext = new OperationContext<>(div);
        Assert.assertEquals(3, divContext.compute(9, 3), DELTA);
    }
}
