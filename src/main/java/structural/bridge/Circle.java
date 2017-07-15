package structural.bridge;

/**
 * Created by sggb on 2017/6/28.
 */
public class Circle extends Shape {
    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        drawAPI.drawShape();
    }
}
