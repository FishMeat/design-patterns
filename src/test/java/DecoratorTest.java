import composite.*;
import decorator.PromptDecorator;
import decorator.StarDecorator;
import org.junit.Test;

/**
 * Created by sggb on 2017/6/24.
 */
public class DecoratorTest {
    @Test
    public void test() {
        FileComponent text = new StarDecorator(new TextFile("文本"));
        FileComponent image = new ImageFile("图片");
        FileComponent video = new PromptDecorator(new VideoFile("视频"));

        text.showName();
        image.showName();
        video.showName();

        FileComponent folder = new StarDecorator(new PromptDecorator(new Folder("文件夹")));
        folder.add(text);
        folder.add(image);
        folder.add(video);
        folder.showName();
        folder.remove(video);
        folder.showName();
        FileComponent file = folder.getChild(1);
        file.showName();
    }
}
