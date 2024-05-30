import java.util.Scanner;

public class Assignment23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchNumber = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchNumber) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("The number is not found in the array.");
        } else {
            System.out.println("The number is found at index: " + index);
        }
        scanner.close();
    }
}