package composite;

/**
 * @author sggb
 * @since 2017/6/21
 */
public interface FileComponent {

    void showName();

    default void add(FileComponent component) {
        throw new UnsupportedOperationException("不支持此操作");
    }

    default void remove(FileComponent component) {
        throw new UnsupportedOperationException("不支持此操作");
    }

    default FileComponent getChild(int i) {
        throw new UnsupportedOperationException("不支持此操作");
    }
}
