package iterator;

/**
 * Created by sggb on 2017/7/4.
 */
public interface Iterator<T> {

    void first();

    void next();

    boolean isDone();

    T currentItem();
}
