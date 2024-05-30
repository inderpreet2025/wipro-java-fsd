public class Assignment10 {
    public static String repeatFirstTwoChars(String str) {
        if (str.length() < 2) {
            return str; // If the string is less than 2 characters long, return it as is.
        }

        String firstTwoChars = str.substring(0, 2);
        int n = str.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(firstTwoChars);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String testStr = "Wipro";
        System.out.println(repeatFirstTwoChars(testStr));
    }
}
