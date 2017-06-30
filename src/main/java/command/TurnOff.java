package command;

/**
 * Created by sggb on 2017/6/30.
 */
public class TurnOff implements Command {
    @Override
    public void execute(Receiver receiver) {
        receiver.action();
    }
}
