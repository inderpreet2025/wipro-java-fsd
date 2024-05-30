import java.util.Scanner;

public class Assignment17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the integer n: ");
        int n = scanner.nextInt();
        String outputString = "";
        if (n >= 0 && n <= inputString.length()) {
            for (int i = 0; i < n; i++) {
                outputString += inputString.substring(inputString.length() - n);
            }
        }
        System.out.println("Output: " + outputString);
        scanner.close();
    }
}