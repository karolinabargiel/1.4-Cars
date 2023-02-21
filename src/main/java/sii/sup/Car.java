package sii.sup;
import java.util.List;

public class Car {
    Producent producent;
    private final boolean isAutomaticGear;
    Market market;
    String segment;
    List<Dimension> dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, List<Dimension> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public Producent getProducent() {
        return producent;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producent=" + producent +
                ", isAutomaticGear=" + isAutomaticGear +
                ", market=" + market +
                ", segment='" + segment + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }

    public static boolean isDimensionMoreThanParam(Car c, int param) {
        for (Dimension dimension : c.getDimensions()) {
            if (dimension.getTrunkCapacity() > param) {
                return true;
            }
        }
        return false;
    }

    public static void filterCars(List<Car> cars, String producent, boolean isAutomated, int trunkCapacity) {
        for (Car car : cars) {
            Market market = car.getMarket();
            Producent prod = car.getProducent();
            boolean isAuto = car.isAutomaticGear();
            if (!isDimensionMoreThanParam(car, trunkCapacity)) {
                continue;
            }

            for (Country country : market.getCountries()) {
                if (producent.equals(prod.getModel()) && isAutomated == isAuto) {
                    System.out.print(prod);
                    System.out.println(country);
                }
            }
        }

    }
}
