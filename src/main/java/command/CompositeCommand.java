package command;

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
        compositeCommands.add(command);
    }

    public void remove(Command command) {
        compositeCommands.remove(command);
    }
}
