package structural;

import org.junit.Test;
import structural.composite.*;

/**
 * @author sggb
 * @since 2017/6/21
 */
public class CompositeTest {

    @Test
    public void test() {
        FileComponent text = new TextFile("文本");
        FileComponent image = new ImageFile("图片");
        FileComponent video = new VideoFile("视频");

        text.showName();
        image.showName();
        video.showName();

        FileComponent folder = new Folder("文件夹");
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
