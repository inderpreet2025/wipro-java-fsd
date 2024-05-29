import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment15 {

    public static void main(String[] args) {

        HashMap<String, Integer> contactList = new HashMap<>();

        contactList.put("Alice", 1234567890);
        contactList.put("Bob", 345678901);
        contactList.put("Charlie", 456789012);
        contactList.put("David", 567890123);
        contactList.put("Eve", 678901234);

        String keyToCheck = "Alice";
        if (contactList.containsKey(keyToCheck)) {
            System.out.println("The contact \"" + keyToCheck + "\" exists in the contact list.");
        } else {
            System.out.println("The contact \"" + keyToCheck + "\" does not exist in the contact list.");
        }


        Integer valueToCheck = 456789012;
        if (contactList.containsValue(valueToCheck)) {
            System.out.println("The phone number \"" + valueToCheck + "\" exists in the contact list.");
        } else {
            System.out.println("The phone number \"" + valueToCheck + "\" does not exist in the contact list.");
        }

        Set<Map.Entry<String, Integer>> entrySet = contactList.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        System.out.println("Iterating through the contact list:");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }
}
