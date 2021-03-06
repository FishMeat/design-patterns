package creational.builder;

/**
 * Created by sggb on 2017/7/8.
 */
public interface Builder {

    Builder BuildName();

    Builder BuildColor(String colorName);

    <T> T getTraffic();
}
