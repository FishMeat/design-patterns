package behavioral.iterator;

/**
 * Created by sggb on 2017/7/4.
 */
public class AfterIterator<T> implements Iterator<T> {

    private final Aggregate<T> aggregate;

    private int index = 0;

    public AfterIterator(Aggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public boolean isDone() {
        return index >= aggregate.length();
    }

    @Override
    public T currentItem() {
        return aggregate.get(index);
    }
}
