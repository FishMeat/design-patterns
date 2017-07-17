package structural.facade;

/**
 * Created by sggb on 2017/7/17.
 */
public class Facade {
    private final SystemA systemA;

    private final SystemB systemB;

    private final SystemC systemC;

    public Facade() {
        this.systemA = new SystemA();
        this.systemB = new SystemB();
        this.systemC = new SystemC();
    }

    public void operation() {
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }
}
