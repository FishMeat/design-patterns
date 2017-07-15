package structural.bridge;

/**
 * Created by sggb on 2017/6/28.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
