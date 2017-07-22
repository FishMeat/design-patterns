package behavioral.visitor;

/**
 * Created by sggb on 2017/7/6.
 */
public class ProductAVisitor implements Visitor {
    @Override
    public void visitProductA(ProductA productA) {
        System.out.println(productA.getPrice());
    }
}
