package command;

/**
 * Created by sggb on 2017/6/30.
 */
public class TurnOn implements Command {
    @Override
    public void execute(Receiver receiver) {
        receiver.action();
    }
}
