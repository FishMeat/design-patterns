package visitor;

/**
 * Created by sggb on 2017/7/6.
 */
public interface Visitor {

    default void visitProductA(ProductA productA) {
    }

    default void visitProductB(ProductB productB) {
    }
}
