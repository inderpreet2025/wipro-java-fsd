import java.util.Scanner;

public class Assignment16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        StringBuilder combinedString = new StringBuilder();
        int i = 0;
        while (i < string1.length() && i < string2.length()) {
            combinedString.append(string1.charAt(i));
            combinedString.append(string2.charAt(i));
            i++;
        }
        while (i < string1.length()) {
            combinedString.append(string1.charAt(i));
            i++;
        }
        while (i < string2.length()) {
            combinedString.append(string2.charAt(i));
            i++;
        }
        System.out.println("Output: " + combinedString.toString());
        scanner.close();
    }
}