package behavioral.interpreter;

/**
 * Created by sggb on 2017/7/24.
 */
public class AndExpression implements Expression {
    private final Expression expression1;

    private final Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
