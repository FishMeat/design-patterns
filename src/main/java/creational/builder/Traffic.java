package creational.builder;

/**
 * Created by sggb on 2017/7/8.
 */
public class Traffic {

    public <T> T createTraffic(Builder builder) {
        return builder.BuildName().BuildColor("绿色").getTraffic();
    }
}
