package strategy;

/**
 * @author sggb
 * @since 2017/6/22
 */
public class multiStrategy implements OperationStrategy {

    @Override
    public double operation(double a, double b) {
        return a * b;
    }
}
