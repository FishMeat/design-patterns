package visitor;

/**
 * Created by sggb on 2017/7/6.
 */
public class ProductA implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitProductA(this);
    }
}
