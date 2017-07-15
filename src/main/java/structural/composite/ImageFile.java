package structural.composite;

/**
 * @author sggb
 * @since 2017/6/21
 */
public class ImageFile implements FileComponent {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("图像文件名:" + name);
    }
}
