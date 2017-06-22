package strategy;

/**
 * @author sggb
 * @since 2017/6/22
 */
public class OperationContext<T extends OperationStrategy> {

    private OperationStrategy strategy;

    public OperationContext(T t) {
        this.strategy = t;
    }

    public double compute(double a, double b) {
        return strategy.operation(a, b);
    }
}
