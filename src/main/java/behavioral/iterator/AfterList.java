package behavioral.iterator;

/**
 * Created by sggb on 2017/7/4.
 */
public class AfterList<T> extends AbstractList<T> {
    @Override
    public Iterator<T> createIterator() {
        return new AfterIterator<>(this);
    }
}
