import bridge.*;
import org.junit.Test;

/**
 * Created by sggb on 2017/6/28.
 */
public class BridgeTest {
    @Test
    public void test() {
        DrawAPI drawAPI = new RedCircle();
        Shape circle = new Circle(drawAPI);
        circle.draw();
        drawAPI = new GreenCircle();
        circle = new Circle(drawAPI);
        circle.draw();
    }
}
