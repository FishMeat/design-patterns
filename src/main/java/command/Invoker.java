package command;

/**
 * Created by sggb on 2017/6/30.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
