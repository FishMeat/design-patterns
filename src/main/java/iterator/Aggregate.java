package iterator;

/**
 * Created by sggb on 2017/7/4.
 */
public interface Aggregate<T> {
    
    void add(T t);

    void remove(T t);
    
    Iterator<T> createIterator();

    int length();

    T get(int index);
}
