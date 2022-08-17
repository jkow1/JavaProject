package Lesson4;

public class Country {
    public String countryName;
    public char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    @Override
    public String toString() {
        return countryName + " - " + countrySign;
    }
}
