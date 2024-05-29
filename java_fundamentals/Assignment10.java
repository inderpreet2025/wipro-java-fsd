public class Assignment10 {
    public static void main(String[] args) {
        char char1 = 'a';
        char char2 = 'A';

        System.out.println(convertCase(char1));  
        System.out.println(convertCase(char2));  
    }

    private static String convertCase(char c) {
        if (Character.isLowerCase(c)) {
            return  c + "=>" + Character.toUpperCase(c);
        } else if (Character.isUpperCase(c)) {
            return  c + "=>" + Character.toLowerCase(c);
        } else {
            return "Invalid character input";
        }
    }
}
