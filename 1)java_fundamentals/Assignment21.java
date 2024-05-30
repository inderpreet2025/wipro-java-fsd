import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        scanner.close();

        double average = (double) sum / size;

        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
    }
}