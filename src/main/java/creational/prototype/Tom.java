package creational.prototype;

/**
 * Created by sggb on 2017/7/12.
 */
public class Tom implements Person {

    private final String name;

    public Tom() {
        name = "Tom";
    }

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return name;
    }
}
