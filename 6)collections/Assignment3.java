import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment3 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("My");
        stringList.add("name");
        stringList.add("is");
        stringList.add("Inderpreet");
        stringList.add("Singh");
        stringList.add("!");
        printAll(stringList);
    }

    public static void printAll(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}