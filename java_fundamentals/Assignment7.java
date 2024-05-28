import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char c1 = sc.next().charAt(0);

        System.out.print("Enter the second character: ");
        char c2 = sc.next().charAt(0);

        char lowerC1 = Character.toLowerCase(c1);
        char lowerC2 = Character.toLowerCase(c2);

        if (lowerC1 < lowerC2) {
            System.out.println("Characters in alphabetical order: " + c1 + ", " + c2);
        } else {
            System.out.println("Characters in alphabetical order: " + c2 + ", " + c1);
        }

        sc.close();
    }
}
