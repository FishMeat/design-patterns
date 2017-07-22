package behavioral.visitor;

/**
 * Created by sggb on 2017/7/6.
 */
public interface Visitor {

    default void visitProductA(ProductA productA) {
        System.out.println(0);
    }

    default void visitProductB(ProductB productB) {
        System.out.println(0);
    }
}
