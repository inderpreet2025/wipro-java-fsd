import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment13 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington D.C.");
        map.put("Japan", "Tokyo");
        map.put("Germany", "Berlin");
        map.put("Canada", "Ottawa");

        String keyToCheck = "India";
        if (map.containsKey(keyToCheck)) {
            System.out.println("The key \"" + keyToCheck + "\" exists in the map.");
        } else {
            System.out.println("The key \"" + keyToCheck + "\" does not exist in the map.");
        }

        String valueToCheck = "Tokyo";
        if (map.containsValue(valueToCheck)) {
            System.out.println("The value \"" + valueToCheck + "\" exists in the map.");
        } else {
            System.out.println("The value \"" + valueToCheck + "\" does not exist in the map.");
        }

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        System.out.println("Iterating through the map:");
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
