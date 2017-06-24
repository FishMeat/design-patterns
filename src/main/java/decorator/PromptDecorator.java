package decorator;

import composite.FileComponent;

/**
 * Created by sggb on 2017/6/24.
 */
public class PromptDecorator extends Decorator {
    public PromptDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public void add(FileComponent component) {
        prompt();
        super.add(component);
    }

    @Override
    public void remove(FileComponent component) {
        prompt();
        super.remove(component);
    }

    private void prompt() {
        System.out.println("组件被改变");
    }
}
