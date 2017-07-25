package behavioral;

import behavioral.mediator.ApplicationMediator;
import behavioral.mediator.ConcreteColleague;
import behavioral.mediator.MobileColleague;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/25.
 */
public class MediatorTest {
    @Test
    public void test() {
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator);
        MobileColleague mobile = new MobileColleague(mediator);

        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello world");
        mobile.send("Hello");
    }
}
