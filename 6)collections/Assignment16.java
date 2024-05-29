import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Assignment16 {

    private TreeMap<String, String> M1;

    public Assignment16() {
        M1 = new TreeMap<>();
    }

    // Method to save country and capital
    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Method to get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Method to get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Method to create a map with capital as key and country as value
    public TreeMap<String, String> createCapitalCountryMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // Method to create a list of all country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        Assignment16 countryCapitalMap = new Assignment16();

        // Adding countries and capitals
        countryCapitalMap.saveCountryCapital("India", "Delhi");
        countryCapitalMap.saveCountryCapital("Japan", "Tokyo");

        // Get and print capital of a country
        System.out.println("Capital of India: " + countryCapitalMap.getCapital("India"));

        // Get and print country by capital name
        System.out.println("Country with capital Tokyo: " + countryCapitalMap.getCountry("Tokyo"));

        // Create and print map with capital as key and country as value
        TreeMap<String, String> capitalCountryMap = countryCapitalMap.createCapitalCountryMap();
        System.out.println("Capital-Country Map: " + capitalCountryMap);

        // Get and print list of all countries
        ArrayList<String> allCountries = countryCapitalMap.getAllCountries();
        System.out.println("All Countries: " + allCountries);
    }
}
