import command.*;
import org.junit.Test;

/**
 * Created by sggb on 2017/6/30.
 */
public class CommandTest {
    @Test
    public void test() {

        Command turnOn = new TurnOn(() -> System.out.println("执行命令：开！"));

        Command turnOff = new TurnOff(() -> System.out.println("执行命令：关！"));

        Invoker invoker = new Invoker();
        invoker.setCommand(turnOn);
        invoker.execute();

        invoker.setCommand(turnOff);
        invoker.execute();

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(turnOn);
        compositeCommand.add(turnOff);
        invoker.setCommand(compositeCommand);
        invoker.execute();

        compositeCommand.remove(turnOff);
        invoker.execute();
    }
}
