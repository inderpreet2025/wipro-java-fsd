import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Assignment14 {

    public static void main(String[] args) {

        Properties statesAndCapitals = new Properties();

        statesAndCapitals.setProperty("Andhra Pradesh", "Amaravati");
        statesAndCapitals.setProperty("Bihar", "Patna");
        statesAndCapitals.setProperty("Karnataka", "Bengaluru");
        statesAndCapitals.setProperty("Maharashtra", "Mumbai");
        statesAndCapitals.setProperty("Tamil Nadu", "Chennai");
        statesAndCapitals.setProperty("West Bengal", "Kolkata");

        Set<Map.Entry<Object, Object>> entrySet = statesAndCapitals.entrySet();

        Iterator<Map.Entry<Object, Object>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
