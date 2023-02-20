package sii.sup;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private final String name;
    List<Country> countries = new ArrayList<>();


    public Market(String name) {
        this.name = name;

    }

    public void addCountryToMarket(Country country) {
        countries.add(country);
    }

    public String getName() {
        return name;
    }


    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }
}
