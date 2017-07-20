package structural.proxy;

/**
 * Created by sggb on 2017/7/20.
 */
public class RealSubject implements Subject {
    private final String name;

    public RealSubject(String name) {
        this.name = name;
    }

    @Override
    public String showName() {
        return name;
    }
}
