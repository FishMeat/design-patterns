package behavioral;

import behavioral.template.Cricket;
import behavioral.template.Football;
import behavioral.template.Game;
import org.junit.Test;

public class TemplateTest {
    @Test
    public void test() {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
