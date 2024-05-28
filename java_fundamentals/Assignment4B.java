import java.util.Scanner;

public class Assignment4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        scanner.close();

        boolean sameLastDigit = hasSameLastDigit(num1, num2);

        System.out.println("Do " + num1 + " and " + num2 + " have the same last digit? " + sameLastDigit);
    }

    public static boolean hasSameLastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}