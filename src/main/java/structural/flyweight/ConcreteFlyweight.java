package structural.flyweight;

/**
 * Created by sggb on 2017/7/18.
 */
public class ConcreteFlyweight implements Flyweight {
    private int inStatus;

    public ConcreteFlyweight() {
        inStatus = 0;
    }

    @Override
    public void operation(int exStatus) {
        System.console().printf("%d, %d\n", inStatus, exStatus);
    }
}
