package behavioral.responsibility;

/**
 * Created by sggb on 2017/7/22.
 */
public class ConcreteHandlerA implements Handler {
    private final Handler successor;

    public ConcreteHandlerA(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(String s) {
        if (s.equals("A")) {
            System.out.println(s);
        } else {
            if (successor != null)
                successor.handleRequest(s);
        }

    }
}
