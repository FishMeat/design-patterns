package iterator;

/**
 * Created by sggb on 2017/7/4.
 */
public class BeforeList<T> extends AbstractList<T> {
    @Override
    public Iterator<T> createIterator() {
        return new BeforeIterator<>(this);
    }
}
