import java.util.Scanner;

public class Assignment25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int largest1 = array[0];
        int largest2 = array[1];
        if (largest1 < largest2) {
            int temp = largest1;
            largest1 = largest2;
            largest2 = temp;
        }

        int smallest1 = array[0];
        int smallest2 = array[1];
        if (smallest1 > smallest2) {
            int temp = smallest1;
            smallest1 = smallest2;
            smallest2 = temp;
        }

        for (int i = 2; i < size; i++) {
            if (array[i] > largest1) {
                largest2 = largest1;
                largest1 = array[i];
            } else if (array[i] > largest2) {
                largest2 = array[i];
            }
            if (array[i] < smallest1) {
                smallest2 = smallest1;
                smallest1 = array[i];
            } else if (array[i] < smallest2) {
                smallest2 = array[i];
            }
        }

        System.out.println("The largest 2 numbers are: " + largest1 + " and " + largest2);
        System.out.println("The smallest 2 numbers are: " + smallest1 + " and " + smallest2);
        scanner.close();
    }
}