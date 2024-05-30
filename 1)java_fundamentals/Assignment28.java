import java.util.Scanner;

public class Assignment28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array Elements - " + arrayToString(arr));
        System.out.println("Output: " + sumWithCondition(arr));
        scanner.close();
    }

    public static int sumWithCondition(int[] arr) {
        int sum = 0;
        boolean ignore = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                ignore = true;
            } else if (arr[i] == 7 && ignore) {
                ignore = false;
            } else if (!ignore) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
