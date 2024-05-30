import java.util.*;
public class Assignment13 {
    public static String combineStrings(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(combineStrings("hi", "hello")); 
        System.out.println(combineStrings("", "hello")); 
        System.out.println(combineStrings("hi", "")); 
    }
}
