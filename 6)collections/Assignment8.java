import java.util.HashSet;

public class Assignment8 {
    private HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Assignment8 countryHashSet = new Assignment8();
        countryHashSet.saveCountryNames("USA");
        countryHashSet.saveCountryNames("Canada");
        countryHashSet.saveCountryNames("Mexico");

        System.out.println(countryHashSet.getCountry("USA"));
        System.out.println(countryHashSet.getCountry("India"));
    }
}
