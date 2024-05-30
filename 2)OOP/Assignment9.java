public class Assignment9 {
    public static String concatenate(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str1 = str1.substring(0, str1.length() - 1);
        }

        return str1 + str2;
    }

    public static void main(String[] args) {
        String str1 = "Sachin";
        String str2 = "Tendulkar";
        System.out.println(concatenate(str1, str2));

        str1 = "Mark";
        str2 = "kate";
        System.out.println(concatenate(str1, str2));
    }
}
