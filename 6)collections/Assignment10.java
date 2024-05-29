import java.util.*;

public class Assignment10 {
    public static void main(String[] args) {

        Set<String> employeeNames = new TreeSet<>();

        employeeNames.add("John Doe");
        employeeNames.add("Jane Doe");
        employeeNames.add("Alice Smith");
        employeeNames.add("Bob Johnson");

        // Reverse the elements of the TreeSet
        System.out.println("Reversed elements of the TreeSet:");
        NavigableSet<String> navigableSet = (NavigableSet<String>) employeeNames;
        Iterator<String> reverseIterator = navigableSet.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // Iterate the elements of the TreeSet using an Iterator
        System.out.println("\nIterating elements of the TreeSet:");
        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Check if a particular element exists or not
        String searchName = "Alice Smith";
        if (employeeNames.contains(searchName)) {
            System.out.println("\nElement " + searchName + " exists in the TreeSet.");
        } else {
            System.out.println("\nElement " + searchName + " does not exist in the TreeSet.");
        }
    }
}
