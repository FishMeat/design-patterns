package creational.prototype;

/**
 * Created by sggb on 2017/7/12.
 */
public class Cat implements Person {
    private final String name;

    public Cat() {
        name = "Cat";
    }

    @Override
    public Person clone() {
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
