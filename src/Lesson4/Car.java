package Lesson4;

import java.util.ArrayList;

public class Car {
    public Producent producent;
    public boolean isAutomaticGear;
    public Market market;
    public String segment;
    public ArrayList<Dimension> dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public void findAndDisplayCountry(String model, int trunk) {
        if (getProducent().getModel().equals(model)) {
            if (isAutomaticGear) {
                for (Dimension dimension : getDimensions()) {
                    if (dimension.getTrunkCapacity() > trunk) {
                        System.out.println(market.getCountries().toString());
                        break;
                    }
                }
            }
        }
    }

    public Producent getProducent() {
        return producent;
    }
    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }
}
