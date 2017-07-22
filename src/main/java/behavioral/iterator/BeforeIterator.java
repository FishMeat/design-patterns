package behavioral.iterator;

/**
 * Created by sggb on 2017/7/4.
 */
public class BeforeIterator<T> implements Iterator<T> {

    private final Aggregate<T> aggregate;

    private int index;

    public BeforeIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
        index = aggregate.length() - 1;
    }

    @Override
    public void first() {
        index = aggregate.length() - 1;
    }

    @Override
    public void next() {
        index--;
    }

    @Override
    public boolean isDone() {
        return index < 0;
    }

    @Override
    public T currentItem() {
        return aggregate.get(index);
    }
}
