package behavioral.mediator;

/**
 * Created by sggb on 2017/7/25.
 */
public abstract class Colleague {
    private final Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}
