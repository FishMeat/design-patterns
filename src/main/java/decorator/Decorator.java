package decorator;

import composite.FileComponent;

/**
 * Created by sggb on 2017/6/24.
 */
public abstract class Decorator implements FileComponent {

    private FileComponent component;

    public Decorator(FileComponent component) {
        this.component = component;
    }


    @Override
    public void showName() {
        component.showName();
    }

    @Override
    public void add(FileComponent component) {
        this.component.add(component);
    }

    @Override
    public void remove(FileComponent component) {
        this.component.remove(component);
    }

    @Override
    public FileComponent getChild(int i) {
        return this.component.getChild(i);
    }
}
