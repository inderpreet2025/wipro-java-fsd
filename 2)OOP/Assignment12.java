import java.util.*;
public class Assignment12 {
    public static String removeFirstLast(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(removeFirstLast("Suman"));
        System.out.println(removeFirstLast("a")); 
        System.out.println(removeFirstLast("ab"));
    }
}
