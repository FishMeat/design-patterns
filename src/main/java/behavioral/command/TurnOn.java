package behavioral.command;

/**
 * Created by sggb on 2017/6/30.
 */
public class TurnOn implements Command {

    private Receiver receiver;

    public TurnOn(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
