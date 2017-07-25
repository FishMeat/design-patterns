package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sggb on 2017/7/25.
 */
public class ApplicationMediator implements Mediator {
    private final List<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague originator) {
        colleagues.forEach(c -> {
            if (c != originator) {
                c.receive(message);
            }
        });
    }
}
