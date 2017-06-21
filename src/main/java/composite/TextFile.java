package composite;

/**
 * @author sggb
 * @since 2017/6/21
 */
public class TextFile implements FileComponent {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("文本文件名:" + name);
    }
}
