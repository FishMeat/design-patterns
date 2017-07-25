package behavioral.mediator;

/**
 * Created by sggb on 2017/7/25.
 */
public class MobileColleague extends Colleague {
    public MobileColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }
}
