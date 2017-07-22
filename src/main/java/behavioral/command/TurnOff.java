package behavioral.command;

/**
 * Created by sggb on 2017/6/30.
 */
public class TurnOff implements Command {

    private Receiver receiver;

    public TurnOff(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
