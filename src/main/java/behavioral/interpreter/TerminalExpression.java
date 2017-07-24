package behavioral.interpreter;

/**
 * Created by sggb on 2017/7/24.
 */
public class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
