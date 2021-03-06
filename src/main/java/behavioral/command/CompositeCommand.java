package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sggb on 2017/6/30.
 */
public class CompositeCommand implements Command {

    private final List<Command> compositeCommands;

    public CompositeCommand() {
        compositeCommands = new ArrayList<>();
    }

    @Override
    public void execute() {
        compositeCommands.forEach(Command::execute);
    }

    public void add(Command command) {
        System.out.println("增加命令");
        compositeCommands.add(command);
    }

    public void remove(Command command) {
        System.out.println("移除命令");
        compositeCommands.remove(command);
    }
}
