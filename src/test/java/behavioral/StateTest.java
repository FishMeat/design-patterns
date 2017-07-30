package behavioral;

import behavioral.state.Context;
import behavioral.state.StartState;
import behavioral.state.StopState;
import org.junit.Test;

public class StateTest {
    @Test
    public void test() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
