package strategy;

/**
 * @author sggb
 * @since 2017/6/22
 */
public class DivStrategy implements OperationStrategy {

    @Override
    public double operation(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }

        return a / b;
    }
}
