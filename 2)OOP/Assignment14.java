import java.util.*;
public class Assignment14 {
    public static String removeXChars(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
            return str.substring(1, str.length() - 1);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(removeXChars("xHix")); 
        System.out.println(removeXChars("America")); 
        System.out.println(removeXChars("x")); 
        System.out.println(removeXChars("xx")); 
        System.out.println(removeXChars("ax")); 
        System.out.println(removeXChars("xa")); 
    }
}