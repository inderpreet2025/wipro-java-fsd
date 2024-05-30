import java.util.Scanner;

public class Assignment15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with *: ");
        String inputString = scanner.nextLine();
        String outputString = "";
        int starIndex = inputString.indexOf("*");
        if (starIndex != -1) {
            outputString = inputString.substring(starIndex + 1);
        }
        System.out.println("Output: " + outputString);
        scanner.close();
    }
}