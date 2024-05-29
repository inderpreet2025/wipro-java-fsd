import java.util.TreeSet;

public class Assignment11 {
    private TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    public String getCountry(String countryName) {
        for (String country : T1) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Assignment11 countryTreeSet = new Assignment11();
        countryTreeSet.saveCountryNames("USA");
        countryTreeSet.saveCountryNames("Canada");
        countryTreeSet.saveCountryNames("Mexico");

        System.out.println(countryTreeSet.getCountry("USA"));
        System.out.println(countryTreeSet.getCountry("India"));
    }
}
