package creational.builder;

/**
 * Created by sggb on 2017/7/8.
 */
public class BikeBuilder implements Builder {
    private Bike bike;

    public BikeBuilder() {
        bike = new Bike();
    }


    @Override
    public Builder BuildName() {
        bike.setName("自行车");
        return this;
    }

    @Override
    public Builder BuildColor(String colorName) {
        bike.setColorName(colorName);
        return this;
    }

    @Override
    public Bike getTraffic() {
        return bike;
    }
}
