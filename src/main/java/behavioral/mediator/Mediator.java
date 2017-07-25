package behavioral.mediator;

/**
 * Created by sggb on 2017/7/25.
 */
public interface Mediator {
    void send(String message, Colleague colleague);
}
