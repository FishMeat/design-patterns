package behavioral;

import behavioral.interpreter.AndExpression;
import behavioral.interpreter.Expression;
import behavioral.interpreter.OrExpression;
import behavioral.interpreter.TerminalExpression;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/24.
 */
public class InterpreterTest {
    @Test
    public void test() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
