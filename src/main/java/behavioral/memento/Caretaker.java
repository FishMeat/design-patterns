package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sggb on 2017/7/29.
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
