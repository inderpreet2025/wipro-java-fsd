import java.util.Arrays;

public class Assignment30 {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = {3, 3, 2};
        int[] arr3 = {2, 2, 2};

        System.out.println(Arrays.toString(evenOdd(arr1)));
        System.out.println(Arrays.toString(evenOdd(arr2)));
        System.out.println(Arrays.toString(evenOdd(arr3)));
    }

    public static int[] evenOdd(int[] arr) {
        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[evenIndex] = arr[i];
                evenIndex++;
            } else {
                result[oddIndex] = arr[i];
                oddIndex--;
            }
        }
        return result;
    }
}