package iterator;

import java.util.ArrayList;

/**
 * Created by sggb on 2017/7/4.
 */
public class List<T> implements Aggregate<T> {

    private final java.util.List<T> list;

    public List() {
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
    public Iterator<T> createIterator() {
        return new AfterIterator<>(this);
    }

    @Override
    public int length() {
        return list.size();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}
