package structural.composite;

/**
 * @author sggb
 * @since 2017/6/21
 */
public class VideoFile implements FileComponent {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("音频文件名:" + name);
    }
}
