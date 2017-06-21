package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sggb
 * @since 2017/6/21
 */
public class Folder implements FileComponent {

    private String name;

    List<FileComponent> fileComponents;

    public Folder(String name) {
        this.name = name;
        this.fileComponents = new ArrayList<>();
    }

    @Override
    public void showName() {
        System.out.println("文件夹:" + name);
        fileComponents.forEach(FileComponent::showName);
    }

    @Override
    public void add(FileComponent component) {
        fileComponents.add(component);
        System.out.println("添加成功!");
    }

    @Override
    public void remove(FileComponent component) {
        fileComponents.remove(component);
        System.out.println("移除成功!");
    }

    @Override
    public FileComponent getChild(int i) {
        return fileComponents.get(i);
    }
}
