package behavioral.memento;

/**
 * Created by sggb on 2017/7/29.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
