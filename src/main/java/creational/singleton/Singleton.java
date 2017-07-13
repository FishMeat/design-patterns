package creational.singleton;

/**
 * Created by sggb on 2017/7/13.
 */
public final class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton instance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    public String showName() {
        return "hello, world";
    }
}
