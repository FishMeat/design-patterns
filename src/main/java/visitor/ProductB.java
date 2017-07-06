package visitor;

/**
 * Created by sggb on 2017/7/6.
 */
public class ProductB implements Product {

    private final int price;

    public ProductB(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProductB(this);
    }
}
