package behavioral.visitor;

/**
 * Created by sggb on 2017/7/6.
 */
public class ProductBVisitor implements Visitor {
    @Override
    public void visitProductB(ProductB productB) {
        System.out.println(productB.getPrice());
    }
}
