package behavioral;

import behavioral.observer.BinaryObserver;
import behavioral.observer.HexaObserver;
import behavioral.observer.OctalObserver;
import behavioral.observer.Subject;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
