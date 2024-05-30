import java.util.Scanner;

public class Assignment24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array (ascii values):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Character values: ");
        for (int i = 0; i < size; i++) {
            System.out.print((char) array[i] + " ");
        }
        scanner.close();
    }
}