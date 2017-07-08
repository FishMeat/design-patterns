package creational.builder;

/**
 * Created by sggb on 2017/7/8.
 */
public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public Builder BuildName() {

        car.setName("汽车");

        return this;
    }

    @Override
    public Builder BuildColor(String colorName) {
        car.setColorName(colorName);

        return this;
    }

    @Override
    public Car getTraffic() {
        return car;
    }
}
