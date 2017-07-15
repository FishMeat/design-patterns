package structural.decorator;

import structural.composite.FileComponent;

/**
 * Created by sggb on 2017/6/24.
 */
public class StarDecorator extends Decorator {

    public StarDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public void showName() {
        printStars();
        super.showName();
    }

    private void printStars() {
        System.out.println("******************************");
    }
}
