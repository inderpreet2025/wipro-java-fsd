import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the index of the array element you want to access");
        int index = scanner.nextInt();

        try {
            int element = arr[index];
            System.out.println("The array element at index " + index + " = " + element);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}