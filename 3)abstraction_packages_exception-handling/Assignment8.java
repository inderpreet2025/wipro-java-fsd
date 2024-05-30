import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            try {
                numbers[i] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number: ");
                i--; 
            }
        }

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;


        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}