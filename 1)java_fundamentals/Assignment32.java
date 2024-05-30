import java.util.Arrays;

public class Assignment32 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5, 6};
        int[] a2 = {7, 7, 7};
        int[] b2 = {3, 8, 0};
        int[] a3 = {5, 2, 9};
        int[] b3 = {1, 4, 5};

        System.out.println(Arrays.toString(middleway(a1, b1)));
        System.out.println(Arrays.toString(middleway(a2, b2)));
        System.out.println(Arrays.toString(middleway(a3, b3)));
    }

    public static int[] middleway(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }
}