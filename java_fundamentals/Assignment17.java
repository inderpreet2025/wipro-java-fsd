import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = sumOfDigits(number);

        System.out.println("Sum of all digits: " + sum);

        sc.close();
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
