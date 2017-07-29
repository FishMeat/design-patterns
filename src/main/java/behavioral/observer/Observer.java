package behavioral.observer;

public abstract class Observer {
    protected abstract Subject subject();

    public abstract void update();
}
