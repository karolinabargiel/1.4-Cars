package sii.sup;

public class Country {
    private final String countryName;
    private final char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }


    public String getCountryName() {
        return countryName;
    }

    public char getCountrySign() {
        return countrySign;
    }

    @Override
    public String toString() {
        return countryName + " - " +
                 countrySign;
    }
}
