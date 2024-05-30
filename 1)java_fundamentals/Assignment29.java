import java.util.Arrays;

public class Assignment29 {

    public static int[] withoutTen(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};

        System.out.println(Arrays.toString(withoutTen(arr1)));
        System.out.println(Arrays.toString(withoutTen(arr2)));
        System.out.println(Arrays.toString(withoutTen(arr3)));
    }
}
