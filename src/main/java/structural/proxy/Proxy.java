package structural.proxy;

/**
 * Created by sggb on 2017/7/20.
 */
public class Proxy implements Subject {

    private final String name;

    private final Subject subject;

    public Proxy(String name) {
        this.name = name;
        subject = new RealSubject(name);
    }

    @Override
    public String showName() {
        if (name.equals("A")) {
            return subject.showName();
        }
        return "";
    }
}
