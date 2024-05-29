import java.util.HashSet;
import java.util.Iterator;

public class Assignment9 {
    public static void main(String[] args) {
        // Create a HashSet to store employee names
        HashSet<String> employeeNames = new HashSet<>();

        // Add employee names to the HashSet
        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("Diana");
        employeeNames.add("Eve");

        // Retrieve the elements one by one using an iterator
        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            String employeeName = iterator.next();
            System.out.println(employeeName);
        }
    }
}
