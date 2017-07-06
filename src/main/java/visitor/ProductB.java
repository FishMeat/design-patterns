package visitor;

/**
 * Created by sggb on 2017/7/6.
 */
public class ProductB implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitProductB(this);
    }
}
