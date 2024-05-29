import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (between 1 and 255): ");
        int number = scanner.nextInt();
        scanner.close();

        String binaryString = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
        System.out.println("Binary representation: " + binaryString);
    }
}