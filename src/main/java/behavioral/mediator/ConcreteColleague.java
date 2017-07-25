package behavioral.mediator;

/**
 * Created by sggb on 2017/7/25.
 */
public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }
}
