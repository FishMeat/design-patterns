package behavioral.iterator;

import java.util.ArrayList;

/**
 * Created by sggb on 2017/7/4.
 */
public abstract class AbstractList<T> implements Aggregate<T> {

    private final java.util.List<T> list;

    public AbstractList() {
        list = new ArrayList<>();
    }

    @Override
    public void add(T o) {
        list.add(o);
    }

    @Override
    public void remove(T o) {
        list.remove(o);
    }

    @Override
    public abstract Iterator<T> createIterator();

    @Override
    public int length() {
        return list.size();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}
