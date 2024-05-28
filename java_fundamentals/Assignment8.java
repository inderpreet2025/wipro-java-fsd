import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);

        if (Character.isLetter(input)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(input)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

        sc.close();
    }
}
